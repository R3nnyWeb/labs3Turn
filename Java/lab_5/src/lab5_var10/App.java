package lab5_var10;

public class App {
    public static void main(String[] args) {
        PatientManager p = new Patient("Иванов", "Иван", "Иванович");
        p.setAddress("г. Рязань");
        System.out.println(p);
    }
}