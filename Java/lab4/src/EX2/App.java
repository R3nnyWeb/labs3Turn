package EX2;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    public static int getSummaryUsers(ArrayList<MobileTariff> tariffs) {
        int sum = 0;
        for (MobileTariff tariff : tariffs) {
            sum += tariff.getUsers();
        }
    return sum;
    };


    public static void main(String[] args) {


        ArrayList<MobileTariff> tariffs = new ArrayList<MobileTariff>(){
            {
                add(new InternetPhoneTariff(2000,"Мой Интернет", 400, 300, 25000 ));
                add(new InternetPhoneTariff(800, "Много не бывает", 800, 500, 50000));
                add(new InternetPhoneTariff(8000, "ИнтернетМинимум", 150,500,3000));
                add(new PhoneTariff(500,"Болтайте Много", 400, 1000));
                add(new PhoneTariff(300,"Болтайте Средне", 300, 500));
                add(new PhoneTariff(100,"Болтайте Мало", 200, 250));
                add(new TabletTariff(10000,"В машину", 200,25000));
            }
        };
        tariffs.sort(new TariffCostComparator());
        tariffs.forEach(System.out::println);
        System.out.println("Общее кол-во пользователей: " + getSummaryUsers(tariffs));
        Scanner sc = new Scanner(System.in);
        int startUserRange = 0;
        int endUserRange = 0;
        while (startUserRange == 0) {
            System.out.println("Введите начало диапазона пользователей > 0 ");
            try {
                startUserRange = Integer.parseInt(sc.nextLine());
                if (startUserRange < 0){
                    startUserRange = 0;
                }
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введите число");
            }
        }
        while (endUserRange == 0) {
            System.out.println("Введите конец диапазона пользователей > " + startUserRange );
            try {
                endUserRange = Integer.parseInt(sc.nextLine());
                if(startUserRange >= endUserRange){
                    endUserRange = 0;
                }
            } catch (NumberFormatException e){
                System.err.println("Введите число");
            }
        }
        int startCostRange = 0;
        int endCostRange = 0;
        while (startCostRange == 0) {
            System.out.println("Введите начало диапазона стоимости > 0 ");
            try {
                startCostRange = Integer.parseInt(sc.nextLine());
                if (startCostRange < 0){
                    startCostRange = 0;
                }
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введите число");
            }
        }
        while (endCostRange == 0) {
            System.out.println("Введите конец диапазона пользователей > " + startCostRange );
            try {
                endCostRange = Integer.parseInt(sc.nextLine());
                if(startCostRange >= endCostRange){
                    endCostRange = 0;
                }
            } catch (NumberFormatException e){
                System.err.println("Введите число");
            }
        }

        System.out.println(MobileTariffAction.filterByUsersAndCost(tariffs,startUserRange,endUserRange,startCostRange,endCostRange));
    }


}
