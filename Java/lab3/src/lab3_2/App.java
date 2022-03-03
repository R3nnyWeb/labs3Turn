package lab3_2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество элементов в массиве: ");
        int count = scan.nextInt();
        Fraction[] array = new Fraction[count];
        for (int i=0; i<count;++i){
            array[i]=new Fraction(random.nextInt(9)+1, random.nextInt(9)+1);
        }
        System.out.println("Массив случайных дробей ");
        System.out.println(Arrays.toString(array));
        adder(array);
        System.out.println("Измененный массив");
        System.out.println(Arrays.toString(array));
    }

    public static void adder(Fraction [] arr){
        for (int i = 0; i< arr.length-1; i+=2){
            arr[i] = arr[i].add(arr[i+1]);
        }
    }
}