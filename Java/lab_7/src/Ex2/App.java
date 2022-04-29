package Ex2;

import java.util.*;


public class App {

    public static String modifyString(String s){
       s = s.toLowerCase(Locale.ROOT)
                .replace("ё", "е")
                .replace("й","и");

        return s;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = scanner.nextLine();
        System.out.println("Введите фильтрующее слово");
        String filterWord = scanner.nextLine();
        scanner.close();
        text = modifyString(text);
        text =  text.replace(",","")
                .replace("?", "")
                .replace("!", "")
                .replace(".", "")
                .replace(";", "");
        filterWord = modifyString(filterWord);
        String[] splitedText = text.split(" ");
        List<String> words = Arrays.stream(splitedText).toList();
        String finalFilterWord = filterWord;
        words = words.stream().filter(s -> s.equals(finalFilterWord)).toList();
        System.out.println(words.size());
    }
}