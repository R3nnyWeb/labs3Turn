package lab3_2;

public class Fraction {
    int numerator, denominator;

    Fraction(int numerator, int denominator){
        int divider = nod(numerator, denominator);
        this.numerator = numerator/divider;
        this.denominator = denominator/divider;
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
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
        int numerator = this.numerator * secondFraction.denominator + secondFraction.numerator * this.denominator;
        int denominator = this.denominator * secondFraction.denominator;
        return reduce(numerator, denominator);
    }

    public Fraction sub(Fraction secondFraction){
        int numerator = this.numerator * secondFraction.denominator - secondFraction.numerator * this.denominator;
        int denominator = this.denominator * secondFraction.denominator;
        return reduce(numerator, denominator);
    }

    public Fraction mul(Fraction secondFraction){
        int numerator = this.numerator * secondFraction.numerator;
        int denominator = this.denominator * secondFraction.denominator;
        return reduce(numerator, denominator);
    }

    public Fraction div(Fraction secondFraction){
        int numerator = this.numerator * secondFraction.denominator;
        int denominator = this.denominator * secondFraction.numerator;
        return reduce(numerator, denominator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
