package lab5_var10;

public class App {
    public static void main(String[] args) {
        People p = new People("Иванов", "Иван", "Иванович");
        p.setAddress("г. Рязань");

        System.out.println(p);
    }
}
