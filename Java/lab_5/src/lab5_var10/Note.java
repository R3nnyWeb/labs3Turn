package lab5_var10;

import java.text.SimpleDateFormat;
import java.util.Date;

public record Note(Date date, String info) {
    @Override
    public String toString() {
        return (new SimpleDateFormat("yyyy.MM.dd, HH:mm")).format(date) + ": " + info;
    }
}