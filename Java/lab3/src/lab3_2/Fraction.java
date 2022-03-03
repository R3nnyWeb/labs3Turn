package lab3_2;

public class Fraction {
    int m, n;

    Fraction(int numerator, int denominator){
        m = numerator;
        n = denominator;
    }

    public String toString() {
        return m + "/" + n;
    }
    public Fraction add(Fraction sum){
        return new Fraction(this.m*sum.n + sum.m*this.n,this.n*sum.n);
    }
    public Fraction sub(Fraction sub){
        return new Fraction(this.m*sub.n - sub.m*this.n,this.n*sub.n);
    }
}
