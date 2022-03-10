package EX2;

import java.util.Comparator;

public class TariffCostComparator implements Comparator<MobileTariff> {

    @Override
    public int compare(MobileTariff o1, MobileTariff o2) {
        if (o1.getCostInRubles() - o2.getCostInRubles() < 0){
            return -1;
        }
        else return 1;

    }
}
