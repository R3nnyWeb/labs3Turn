package EX2;

import java.util.ArrayList;

public class MobileTariffAction {
    public static ArrayList<MobileTariff> filterByUsersAndCost(ArrayList<MobileTariff> tariffs, int startUserRange, int endUserRange, int startCostRange, int endCostRange){
        ArrayList<MobileTariff> result = new ArrayList<>();
        for (MobileTariff tariff: tariffs) {
            if((tariff.getUsers() > startUserRange) && (tariff.getUsers() < endUserRange) && (tariff.getCostInRubles() > startCostRange) && (tariff.getCostInRubles() < endCostRange)){
                result.add(tariff);
            }
        }


        return result;
    }
}
