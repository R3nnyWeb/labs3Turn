package Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String str = scan.nextLine();
        System.out.println("Введите количество символов");
        long num = scan.nextLong();
        Map<Character, Integer> statistic = new HashMap<>();
        for(int i=0; i<str.length();++i){
            Integer n = statistic.get(str.charAt(i));
            if(n == null){
                statistic.put(str.charAt(i), 1);
            }
            else{
                statistic.put(str.charAt(i), ++n);
            }
        }
        statistic.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(num)
                .forEach(System.out::println);
    }
}
