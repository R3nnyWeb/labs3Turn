package lab3_2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Fraction[] f = new Fraction[3];
        for (int i=0; i<3;++i){
            f[i]=new Fraction(2, 3);
        }
        System.out.println(Arrays.toString(f));
        System.out.println(f[0].add(f[1]));
    }
}