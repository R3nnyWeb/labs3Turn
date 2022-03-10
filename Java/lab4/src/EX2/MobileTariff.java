package EX2;

import java.util.Date;

public abstract class MobileTariff {
    private int users;
    private final Date minutesToTalk;

    protected MobileTariff() {
    }

    public int getUsers() {
        return users;
    }
    public  void addUsers(int count){
        users =+ users;
    };

}
