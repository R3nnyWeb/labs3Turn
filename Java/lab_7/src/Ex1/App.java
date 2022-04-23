package Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = scan.nextLine();
        System.out.println("Введите количество символов для отображения в статистике");
        long limit = scan.nextLong();
        scan.close();
        printStatistic(text, limit);
    }

    public static void printStatistic(String text, long limit){
        Map<Character, Integer> statistic = new HashMap<>();
        for(int i=0; i<text.length();++i){
            Integer n = statistic.get(text.charAt(i));
            if(n == null){
                statistic.put(text.charAt(i), 1);
            }
            else{
                statistic.put(text.charAt(i), ++n);
            }
        }
        statistic.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .limit(limit)
                .forEach(System.out::println);
    }
}
