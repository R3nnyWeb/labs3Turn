

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введиде количество чисел: ");
        int n = 0;
        do {
            n = sc.nextInt();
            if (n<3) System.out.println("Количество чилсел должно быть больше 2");
        } while (n<3);
        int[] mas = new int[n];
        System.out.println("Введите числа: ");
        for(int i = 0; i<n; i++)
            mas[i] = sc.nextInt();
        for(int i = 1; i<n-1; i++)
            if (mas[i] == (mas[i-1]+mas[i+1])/2)
                System.out.println(mas[i]+" является полусуммой "+mas[i-1]+" и " + mas[i+1]);
        sc.close();
    }
}
