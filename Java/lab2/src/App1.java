import java.util.Arrays;
import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите n");
        int n = 0;
        while (n<2){
            System.out.printf("N должно быть больше 1");
            n= input.nextInt();
        }
        int minimumElementLength;
        int maximumElementLength;
        int minimumElementLengthIndex;
        int maximumElementLengthIndex;

        int array[] = new int[n];
        System.out.println("Введите " +n+ " элементов");
        for (int i = 0; i <array.length ; i++) {
            array[i] = input.nextInt();

        }
        input.close();
        Integer currentElement = array[0];
        minimumElementLengthIndex = 0;
        maximumElementLengthIndex = 0;
        minimumElementLength = currentElement.toString().length();
        maximumElementLength = currentElement.toString().length();


        for (int i = 1; i <array.length ; i++) {
            currentElement = array[i];
            int currentElementLength = currentElement.toString().length();
            if (currentElementLength < minimumElementLength){
                minimumElementLength = currentElementLength;
                minimumElementLengthIndex = i;
            }
            if(currentElementLength > maximumElementLength){
                maximumElementLength = currentElementLength;
                maximumElementLengthIndex = i;
            }

        }
        System.out.println(Arrays.toString(array));
        System.out.println("Число с максимальной длинной: " + array[maximumElementLengthIndex] + " Его длина: " + maximumElementLength);
        System.out.println("Число с минимальной длинной: " + array[minimumElementLengthIndex] + " Его длина: " + minimumElementLength);
    }
}
