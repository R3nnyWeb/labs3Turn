package Ex2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        System.out.println("Введите фильтрующее слово");
        String filterWord = scanner.nextLine();
        scanner.close();
        text = text.toLowerCase(Locale.ROOT)
                .replace("ё", "е")
                .replace("й","и");
        String[] splitedText = text.split(" ");
        List<String> words = Arrays.stream(splitedText).toList();
        words = words.stream().filter(s -> s.equals(filterWord)).toList();
        System.out.println(words.size());
    }
}