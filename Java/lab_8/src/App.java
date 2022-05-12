import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InputException {
        final String path = "C:\\Users\\Вячеслав\\Desktop\\labs3Turn\\Java\\lab_8\\src\\numbers.txt";
        ArrayList<Double> numbers = new ArrayList<>();
        try(Scanner scan = new Scanner(new FileReader(path))){
            while (scan.hasNext()){
                String num = scan.next();
                if(!scan.hasNext()){
                    throw new InputException("Отсутствует число или локаль");
                }
                Locale currentLocale = new Locale(scan.next());
                numbers.add(parseNumber(num, currentLocale));
            }
            System.out.println(numbers);
        }
        catch (IOException e){
            throw new InputException("Ошибка открытия файла", e);
        }
        catch (OutOfMemoryError e){
            throw new InputException("Недостаточно памяти", e);
        }
        double sum = 0;
        for(double num : numbers){
            sum += num;
        }
        System.out.printf("Сумма чисел: %.3f \n", sum);
        System.out.printf("Среднее значение чисел: %.3f \n", sum/numbers.size());
    }

    public static double parseNumber(String input, Locale locale) throws InputException{
        NumberFormat numFormat = NumberFormat.getInstance(locale);
        ParsePosition parsePosition = new ParsePosition(0);
        Number number = numFormat.parse(input, parsePosition);
        if(parsePosition.getIndex() != input.length()){
            ParseException e = new ParseException("Число "+input+" некорректно", parsePosition.getIndex());
            throw new InputException("Ошибка преобразования строки в число", e);
        }
        return number.doubleValue();
    }
}