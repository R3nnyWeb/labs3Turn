import java.util.Arrays;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        //Задание 2
        //Ввести с консоли n целых чисел. На консоль вывести:
        //Элементы, которые равны полусумме соседних элементов.
        Scanner sc = new Scanner(System.in);
        System.out.println(" Введите n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i<arr.length; i++) {
            System.out.println(" Введите a[" + i +"] : ");
         arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i <arr.length-1 ; i++) {
            if ((arr[i-1] + arr[i+1])/2 == arr[i]){
                System.out.println("Выполняются условия: arr["+i+"] " +arr[i]);
            }
        }
    }
}
