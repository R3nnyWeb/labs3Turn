import java.util.Random;
import java.util.Scanner;

public class lab2_3 {
    public static void printMatrix(int [][] arr){
        for (int[] i: arr) {
            for (int j : i) {
                System.out.printf("%4s", j);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите размер матрицы: ");
        int size = scan.nextInt();
        int[][] array = new int[size][size];
        for(int i=0; i<size; ++i) {
            for(int j=0; j<size; ++j){
                array[i][j] = random.nextInt(2*size+1)-size;
            }
        }
        System.out.println("Текущая матрица:");
        printMatrix(array);
        //ищем минимальный элемент
        int minValue = array[0][0];
        int row=0, col=0;
        for(int i=0; i<size; ++i) {
            for(int j=0; j<size; ++j){
                if (minValue > array[i][j]) {
                    minValue = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Минимальный элемент в массиве: "+minValue);
        System.out.println("В строке "+(row+1)+" в столбце "+(col+1));
        System.out.println("Введите номер строки и столбца, на которые нужно переместить число");
        int rowTo = scan.nextInt()-1;
        int colTo = scan.nextInt()-1;
        scan.close();
        for(int i=0; i<size; ++i){//меняем столбцы
            int tmp = array[row][i];
            array[row][i] = array[rowTo][i];
            array[rowTo][i] = tmp;
        }
        for(int i=0; i<size; ++i){//меняем строки
            int tmp = array[i][col];
            array[i][col] = array[i][colTo];
            array[i][colTo] = tmp;
        }
        System.out.println("Полученная матрица: ");
        printMatrix(array);
    }
}
