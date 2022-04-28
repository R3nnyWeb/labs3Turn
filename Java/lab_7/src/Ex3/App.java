package Ex3;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Parser parser = new Parser();
        String text = """
                Hello world! Second sentence.
                New paragraph...""";
        ArrayList<String> words;
        Text parsedText = parser.parseText(text);
        System.out.println(parsedText);
    }
}