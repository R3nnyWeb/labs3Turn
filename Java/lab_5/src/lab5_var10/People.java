package lab5_var10;

public class People {
    private String name, surname, patronymic;
    private String address = "Не указан";
    private String phone = "Не указан";

    People(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    People(String name, String surname, String patronymic, String address, String phone){
        this(name, surname, patronymic);
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return  "ФИО: " + name +" "+ surname + " " + patronymic + '\n' +
                "Адрес: " + address + '\n' +
                "Телефон: " + phone;
    }
}