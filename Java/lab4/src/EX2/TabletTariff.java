package EX2;

public class TabletTariff extends MobileTariff{
    private double mBOfInternet;

    public TabletTariff(int users, String name, int costInRubles, double mBOfInternet) {
        super(users, name, costInRubles);
        this.mBOfInternet = mBOfInternet;
    }

    public double getmBOfInternet() {
        return mBOfInternet;
    }

    public void setmBOfInternet(double mBOfInternet) {
        this.mBOfInternet = mBOfInternet;
    }

    @Override
    public String toString() {
        return "TabletTariff{" +
                "users " + getUsers() + '\'' +
                "name='" + getName() + '\'' +
                ", costInRubles=" + getCostInRubles() +
                ", mBOfInternet=" + mBOfInternet +
                '}';
    }
}
