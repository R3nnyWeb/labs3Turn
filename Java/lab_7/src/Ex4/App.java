package Ex4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        StringBuilder text = new StringBuilder(scan.nextLine());
        scan.close();
        ArrayList<String> cyclicShifts = new ArrayList<>();
        for (int i = 0; i<text.length(); ++i){
            cyclicShifts.add(getCyclicShifts(text));
        }
        Collections.sort(cyclicShifts);
        int eol = cyclicShifts.indexOf(text.toString());  //Необходимо для дешифрации
        StringBuilder result = new StringBuilder();
        cyclicShifts.stream()
                .sorted()
                .map(str -> str.charAt(str.length()-1))
                .forEach(result::append);
        System.out.println("Преобразованный текст: " + result);
        System.out.println("Позиция символа конца строки: " + eol);
    }

    public static String getCyclicShifts(StringBuilder str){
        return str.append(str.charAt(0))
                .delete(0, 1)
                .toString();
    }
}