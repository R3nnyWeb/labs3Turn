package lab5_var10;

public class Patient extends People{
    private int ;

    public Patient(String name, String surname, String patronymic, String address, String phone, int id) {
        super(name, surname, patronymic, address, phone);
        this.id = id;
    }
}
