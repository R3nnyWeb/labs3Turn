package EX2;

public class PhoneTariff extends  MobileTariff{
    private int minutesToTalk;

    public int getMinutesToTalk() {
        return minutesToTalk;
    }

    public void setMinutesToTalk(int minutesToTalk) {
        this.minutesToTalk = minutesToTalk;
    }

    public PhoneTariff(int users, String name, int costInRubles, int minutesToTalk) {
        super(users, name, costInRubles);
        this.minutesToTalk = minutesToTalk;
    }

    @Override
    public String toString() {
        return "PhoneTariff{" +
                "users=  " + getUsers() + '\'' +

                "name='" + getName() + '\'' +
                ", costInRubles=" + getCostInRubles() +
                ", minutesToTalk=" + minutesToTalk +
                '}';
    }
}
