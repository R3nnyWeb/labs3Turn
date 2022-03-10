package EX2;

public class InternetPhoneTariff extends  PhoneTariff {
    private double mBOfInternet;

    public InternetPhoneTariff(int users, String name, double costInRubles, int minutesToTalk, double mBOfInternet) {
        super(users, name, costInRubles, minutesToTalk);
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
        return "InternetPhoneTariff{" +
                "users=  " + getUsers() + '\'' +
                "minutesToTalk= " + getMinutesToTalk() + '\'' +
                "mBOfInternet=" + mBOfInternet +
                ", name='" + name + '\'' +
                ", costInRubles=" + costInRubles +
                '}';
    }
}
