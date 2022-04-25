package Ex3;

public class App {
    public static void main(String[] args) {
        Parser parser = new Parser();
        String text = """
                Hello world! Second sentence.
                New paragraph...""";
        Text parsedText = parser.parseText(text);
        System.out.println(parsedText);
    }
}