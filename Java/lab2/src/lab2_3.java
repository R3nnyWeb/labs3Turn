import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class lab2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Введите размер матрицы: ");
        int n = sc.nextInt();
        sc.close();
        int[][] a = new int[n][n];
        for(int i=0; i<n; ++i)
            for(int j=0; j<n; ++j){
                a[i][j] = rd.nextInt(2*n+1)-n;
            }
        for (int[] i: a) {
            for (int j : i) {
                System.out.printf("%3s", j);
            }
            System.out.println("");
        }
    }
}
