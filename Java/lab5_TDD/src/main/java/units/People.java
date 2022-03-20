package units;

import java.util.Objects;

public class People {
    private String name, surname, patronymic;
    private String address = "Не указан";
    private String phone = "Не указан";

    public People(String surname, String name, String patronymic) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public People(String surname, String name, String patronymic, String address, String phone) {
        this(surname, name, patronymic);
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) && Objects.equals(surname, people.surname) && Objects.equals(patronymic, people.patronymic) && Objects.equals(address, people.address) && Objects.equals(phone, people.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, address, phone);
    }

    @Override
    public String toString(){

        return " ФИО: " + surname + " "  + name + " " + patronymic + "\n Адрес: " + address + "\n Телефон: " +phone;
    }



}
