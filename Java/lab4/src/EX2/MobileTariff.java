package EX2;


public abstract class MobileTariff {
    private int users;
    String name;
    double costInRubles;


    public MobileTariff(int users, String name, double costInRubles) {
        this.users = users;
        this.name = name;
        this.costInRubles = costInRubles;
    }

    public int getUsers() {
        return users;
    }

    public void setUsers(int users) {
        this.users = users;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostInRubles() {
        return costInRubles;
    }

    public void setCostInRubles(double costInRubles) {
        this.costInRubles = costInRubles;
    }

    public  void addUsers(int count){
        users =+ users;
    };

}
