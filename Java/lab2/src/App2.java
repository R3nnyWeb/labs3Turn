import java.util.Scanner;

public class App2 {
    static boolean gapOpenOnStartAndClosedOnEnd(double number, double startOfGap, double endOfGap){
        return ((number > startOfGap) && (number<= endOfGap));
    }
    static  boolean gapClosedOnStartAndOpenOnEnd(double number, double startOfGap, double endOfGap) {
        return ((number >= startOfGap) && (number < endOfGap));
    }
    static boolean gapClosedOnStartAndClosedOnEnd(double number, double startOfGap, double endOfGap) {
        return ((number >= startOfGap) && (number <= endOfGap));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число ");
        double number = input.nextDouble();
        System.out.println("Начало промежутка (n) ");
        double startOfGap = input.nextDouble();
        double endOfGap;
        do{
            System.out.println("Конец промежутка промежутка (m) ");
            endOfGap = input.nextDouble();
            if (endOfGap <=startOfGap){
                System.out.println("Начало должно быть больше чем конец");
            }
        }while (endOfGap <= startOfGap);
        System.out.println("Число входит в промежуток (n,m]: " + gapOpenOnStartAndClosedOnEnd(number, startOfGap, endOfGap));
        System.out.println("Число входит в промежуток [n,m): " + gapClosedOnStartAndOpenOnEnd(number, startOfGap, endOfGap));
        System.out.println("Число входит в промежуток [n,m]: " + gapClosedOnStartAndClosedOnEnd(number, startOfGap, endOfGap));
    }
}
