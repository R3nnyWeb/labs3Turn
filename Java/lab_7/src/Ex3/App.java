package Ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Parser parser = new Parser();
        String text = """
                Начало предложения, начало абзаца. Начало второго предложения!
                Второй абзац... Начало вопросительного предложения?""";
        Text parsedText = parser.parseText(text);
        System.out.println("Заданный текст:");
        System.out.println(parsedText);
        ArrayList<String> words = new ArrayList<>();
        words.add("предложения");
        words.add("начало");
        words.add("абзац");
        System.out.println("Список слов:");
        System.out.println(words);
        System.out.println("Количество вхождений слов для каждого предложения: ");
        HashMap<String, Integer> statistics = new HashMap<>();
        words.forEach(word -> statistics.put(word, 0));
        for(Paragraph paragraph: parsedText.getParagraphs()){
            for(Sentence sentence: paragraph.getSentences()){
                HashMap<String, Integer> currentStat = sentence.findTokens(words);
                System.out.println(currentStat);
                currentStat.forEach((key, val)-> statistics.merge(key, val, Integer::sum));
            }
        }
        System.out.println("Статистика по всему тексту:");
        statistics.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(System.out::println);
    }
}