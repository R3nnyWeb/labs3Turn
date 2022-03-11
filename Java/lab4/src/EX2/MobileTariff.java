package EX2;


public abstract class MobileTariff {
    private int users;
    private String name;
    private int costInRubles;


    public MobileTariff(int users, String name, int costInRubles) {
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

    public void setCostInRubles(int costInRubles) {
        this.costInRubles = costInRubles;
    }

    public  void addUsers(int count){
        users =+ users;
    };

}
