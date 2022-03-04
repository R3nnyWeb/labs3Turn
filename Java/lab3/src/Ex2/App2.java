package Ex2;

import java.util.ArrayList;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Vector v1 = new Vector(3,4,6);
        Vector v2 = new Vector(3,5,7);
        System.out.println("Исходные вектора \n" + v1 + "\n" + v2);
        System.out.println("Модуль вектора v1 " + v1.getABSofVector());
        System.out.println("Скалярное призведение " + VectorsAction.getScalarMultiplication(v1,v2));
        System.out.println("Сумма v1 и v2 " + VectorsAction.sumTwoVectors(v1,v2));
        Scanner sc = new Scanner(System.in);
        int constant = 0;
        while (constant == 0) {
            System.out.println("Введите константу не равную 0");
            try {
                constant = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введите число");
            }
        }
        System.out.println("v1 умноженный на " + constant + " " + VectorsAction.multiplyingByConst(v1, constant));

        ArrayList<Vector> vectors = new ArrayList<>(){
            {
                add(v1);
                add(v2);
                add(new Vector(5,6,8));
                add(new Vector(2,2,2));
                add(new Vector(6,6,6));
                add(new Vector(10,2,6));
                add(new Vector(1,3,0));
                add(new Vector(1,2,0));
                add(new Vector(2,-1,0));

            }
        };
        System.out.println("\nСписок векторов: ");
        vectors.forEach(System.out::println);
        int indexOfFirstVector = 0;
        int indexOfSecondVector = 0;

        while (indexOfFirstVector == 0) {
            System.out.println("Введите индекс первого вектора > 0 и < " + (vectors.size() -1) );
            try {
                indexOfFirstVector = Integer.parseInt(sc.nextLine());
                if ((indexOfFirstVector < 0) || (indexOfFirstVector >= vectors.size())){
                    indexOfFirstVector = 0;
                }
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введите число");
            }
        }

        while (indexOfSecondVector == 0) {
            System.out.println("Введите индекс второго вектора > 0 и < " + (vectors.size() -1) + " и не равный " + indexOfFirstVector );
            try {
                indexOfSecondVector = Integer.parseInt(sc.nextLine());
                if ((indexOfSecondVector < 0) || (indexOfSecondVector >= vectors.size()) || (indexOfSecondVector == indexOfFirstVector)){
                    indexOfSecondVector = 0;
                }
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введите число");
            }
        }

        if (VectorsAction.isCollinear(vectors.get(indexOfFirstVector), vectors.get(indexOfSecondVector))){ //3 и 4 коллиниарны
            System.out.println("Вектора коллинеарны");
        }

        if(VectorsAction.isOrthogonal(vectors.get(indexOfFirstVector), vectors.get(indexOfSecondVector))){ // 7 и 8 ортоганальны
            System.out.println("Вектора ортоганальны");
        }
    }

}
