package EX2;

import java.util.ArrayList;



public class App {
    public static int getSummaryUsers(ArrayList<MobileTariff> tariffs) {
        int sum = 0;
        for (int i = 0; i <tariffs.size() ; i++) {
            sum += tariffs.get(i).getUsers();
        }
    return sum;
    };

    public static int getTariffsBy;
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

    }


}
