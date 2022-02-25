package Ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SplittableRandom;

public class TrainAction {
    public static ArrayList<Train> getTrainsComingToGivenDestination(ArrayList<Train> trains, String  destination){
        ArrayList<Train> result = new ArrayList<>();
        for (Train currentTrain : trains) {
            if (currentTrain.getDestination().equals(destination)) {
                result.add(currentTrain);
            }
        }
        return result;
    }
}
