package lab5_var10;

public class PatientInfo {
    private String name, surname, patronymic;
    private String address = "Не указан";
    private String phone = "Не указан";
    static int numOfPatient;
    private final int id;
    private int medCard;

    PatientInfo(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        id = numOfPatient;
        numOfPatient++;
    }

    PatientInfo(String name, String surname, String patronymic, String address, String phone){
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

    public int getMedCard() {
        return medCard;
    }

    public void setMedCard(int medCard) {
        this.medCard = medCard;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  "ID пациента: " + id + '\n' +
                "ФИО: " + name +" "+ surname + " " + patronymic + '\n' +
                "Номер медицинской карты: " + medCard + '\n' +
                "Адрес: " + address + '\n' +
                "Телефон: " + phone;
    }
}