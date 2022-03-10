package lab4_1;

public class App {
    public static void main(String[] args) {
        Piano piano = new Piano(10);
        piano.config();
        System.out.println();
        System.out.println("Проигрываем мелодию");
        int[] melody = {3, 10, 8, 11, 0, 5};
        piano.play(melody);
    }
}