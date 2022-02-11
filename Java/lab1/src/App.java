import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Задание 1
        // Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        System.out.println("Введите n: ");
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int n = sc.nextInt();
        System.out.println("Без перехода: ");
        for (int i = 0; i <n ; i++) {
            System.out.printf(" " + String.valueOf(rd.nextInt(100)));
        }
        sc.close();
        System.out.println();
        System.out.println("С переходом: ");
        for (int i = 0; i <n ; i++) {
            System.out.println(" " + String.valueOf(rd.nextInt(100)));
        }
    }
}
