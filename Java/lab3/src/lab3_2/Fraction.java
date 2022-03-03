package lab3_2;

public class Fraction {
    int m, n;

    Fraction(int numerator, int denominator){
        int divider = nod(numerator, denominator);
        m = numerator/divider;
        n = denominator/divider;
    }

    //Алгоритм Евклида для нахождения НОД
    private int nod(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b !=0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    private Fraction reduce(int numerator, int denominator){
        int divider = nod(numerator, denominator);
        return new Fraction(numerator/divider, denominator/divider);
    }

    public Fraction add(Fraction secondFraction){
        int numerator = this.m * secondFraction.n + secondFraction.m * this.n;
        int denominator = this.n * secondFraction.n;
        return reduce(numerator, denominator);
    }

    public Fraction sub(Fraction secondFraction){
        int numerator = this.m * secondFraction.n - secondFraction.m * this.n;
        int denominator = this.n * secondFraction.n;
        return reduce(numerator, denominator);
    }

    public Fraction mul(Fraction secondFraction){
        int numerator = this.m * secondFraction.m;
        int denominator = this.n * secondFraction.n;
        return reduce(numerator, denominator);
    }

    public Fraction div(Fraction secondFraction){
        int numerator = this.m * secondFraction.n;
        int denominator = this.n * secondFraction.m;
        return reduce(numerator, denominator);
    }

    @Override
    public String toString() {
        return m + "/" + n;
    }
}
