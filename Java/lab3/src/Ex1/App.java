package Ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        ArrayList<Train> trains = new ArrayList(){
            {
                add(new Train("Moscow", "A152", new Date(2022, Calendar.FEBRUARY,25,15,20), 150,130,40));
                add(new Train("Rostov-na-Donu", "A512", new Date(2022,Calendar.FEBRUARY,25,16,22),80,160,20));
                add(new Train("Moscow","A153", new Date(2022,Calendar.FEBRUARY,3,0,25),120,130,40));
                add(new Train("Moscow","A154", new Date(2022,Calendar.FEBRUARY,15,10,28),120,125,40));
                add(new Train("Ryazan","69B", new Date(2022,Calendar.MARCH,3,0,25),100,120,40));
                add(new Train("Ryazan","68B", new Date(2022,Calendar.MARCH,6,4,17),100,120,40));
                add( new Train("Kiev","100C", new Date(2022,Calendar.FEBRUARY,27,16,29),80,120,30));
            }
        };

        trains.forEach(System.out::println);
        String neededDestination = "Moscow";
        System.out.println("Поезда следующие до " + neededDestination);
        TrainAction.getTrainsComingToGivenDestination(trains,neededDestination).forEach(System.out::println);
    }
}
