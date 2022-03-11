package Ex1;

import java.sql.SQLOutput;
import java.util.*;

public class App {
    final static int MIN_HOUR = 0;
    final static int MAX_HOUR = 23;
    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList(){
            {
                add(new Train(Cities.MOSCOW, "A152", new Date(2022, Calendar.FEBRUARY,25,15,20), 150,130,40,20));
                add(new Train(Cities.ROSTOV, "A512", new Date(2022,Calendar.FEBRUARY,25,16,22),80,160,20,20));
                add(new Train(Cities.RYAZAN,"A153", new Date(2022,Calendar.FEBRUARY,3,0,25),120,130,40,20));
                add(new Train(Cities.ROSTOV,"A154", new Date(2022,Calendar.FEBRUARY,15,10,28),120,125,40,20));
                add(new Train(Cities.GROZNIY,"69B", new Date(2022,Calendar.MARCH,3,0,25),100,120,40,20));
                add(new Train(Cities.KRASNODAR,"68B", new Date(2022,Calendar.MARCH,6,4,17),100,120,40,20));
                add( new Train(Cities.KRASNODAR,"100C", new Date(2022,Calendar.FEBRUARY,27,16,49),80,120,30,20));
                add( new Train(Cities.KRASNODAR,"101C", new Date(2022,Calendar.FEBRUARY,29,16,29),0,120,30,20));

            }
        };
        System.out.println("\nОбщий список:\n");
        trains.forEach(System.out::println);
        //Фильтрация по городу
        Cities filterDestination = Cities.KRASNODAR;
        TrainsAction.printTrainsFilteredByCity(trains,filterDestination);
        //Считываю часы для фильрации
        Scanner sc = new Scanner(System.in);
        int filterHour = 255;
        while ((filterHour < MIN_HOUR) || (filterHour > MAX_HOUR)) {
            System.out.println("Введите необходимый час от 0 до 23");
            try {
                filterHour = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){   // Если была введена буква, выполнение не завершится
                System.err.println("Введи число");
            }
        }
        TrainsAction.printTrainsFilteredByCityAndHours(trains, filterDestination, filterHour);
        TrainsAction.printTrainsHaveCommonPlaces(trains, filterDestination);




    }
}
