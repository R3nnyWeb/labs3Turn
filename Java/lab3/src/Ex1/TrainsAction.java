package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainsAction {

    public static void printTrainsFilteredByCity(ArrayList<Train> trains, Cities filterDestination){
        System.out.println("\nСписок поездов, следующих до "+ filterDestination + "  \n");
        trains.stream()
                .filter(x -> x.getDestination() == filterDestination)
                .forEach(System.out::println);

    }
    public  static void printTrainsFilteredByCityAndHours(ArrayList<Train> trains, Cities filterDestination, int filterHour){


        //Фильтрация по городу и по часу отправления
        System.out.println("\nСписок поездов, следующих до "+ filterDestination + " и отправляющихся после " + filterHour + " часов "+"\n");
        int finalFilterHour = filterHour; // Компилятор требовал, чтобы переменная была final  в лямбда выражении
        trains.stream()
                .filter(x -> (x.getDepartureTime().getHours() >= finalFilterHour))
                .filter(x -> (x.getDestination() == filterDestination))
                .forEach(System.out::println);
    }
    public  static void printTrainsHaveCommonPlaces(ArrayList<Train> trains, Cities filterDestination){
        System.out.println("\nСписок поездов, следующих до "+ filterDestination + " и имеющие общие (COMMON) места"+"\n");
        trains.stream()
                .filter(x->(x.getDestination()) == filterDestination)
                .filter(x -> (x.getSeatsCountByType(SeatTypes.COMMON) > 0 ))
                .forEach(System.out::println);
    }
}
