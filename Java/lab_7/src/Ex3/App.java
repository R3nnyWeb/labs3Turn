package Ex3;

public class App {
    public static void main(String[] args) {
        Parser parser = new Parser();
        System.out.println(parser.parseText("""
                Hello world! Second sentence.
                New paragraph"""));
    }
}