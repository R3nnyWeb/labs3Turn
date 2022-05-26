package Ex1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        final String path = "C:\\Users\\Вячеслав\\Desktop\\labs3Turn\\Java\\lab_9\\src\\Ex1\\file.txt";
        ArrayList<String> lines = new ArrayList<>();
        try(Scanner scan = new Scanner(new FileReader(path))) {
            while (scan.hasNextLine()) {
                lines.add(scan.nextLine());
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
        lines.sort(String::compareTo);
        lines.forEach(System.out::println);
    }
}