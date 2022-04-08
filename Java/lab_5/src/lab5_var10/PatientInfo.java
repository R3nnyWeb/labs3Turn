package lab5_var10;

import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class PatientInfo {
    private String name, surname, patronymic;
    private String address = "Не указан";
    private String phone = "Не указан";
    private static int numOfPatient;
    private final int id;
    private int medCard;
    private MedicalBook medBook;

    PatientInfo(String name, String surname, String patronymic){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        medBook = new MedicalBook();
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

    public static int getNumOfPatient() {
        return numOfPatient;
    }

    @Override
    public String toString() {
        return  "ID пациента: " + id + '\n' +
                "ФИО: " + name +" "+ surname + " " + patronymic + '\n' +
                "Номер медицинской карты: " + medCard + '\n' +
                "Адрес: " + address + '\n' +
                "Телефон: " + phone+ '\n';
    }

    public MedicalBook getMedBook() {
        return medBook;
    }

    class MedicalBook{
        private ArrayList<Note> visiting;
        private ArrayList<Note> history;
         private String treatment, diagnosis;

        MedicalBook(){
            visiting = new ArrayList<>();
            history = new ArrayList<>();
        }

        public void addVisiting(Date date, String info){
            visiting.add(new Note(date, info));
        }

        public String getVisiting(){
            return visiting.stream().map(Note::toString).collect(Collectors.joining("\n"));
        }

        public String getTreatment() {
            return treatment;
        }

        public void setTreatment(String treatment) {
            history.add(new Note(new Date(), "Запись о лечении: "+treatment));
            this.treatment = treatment;
        }

        public String getDiagnosis() {
            return diagnosis;
        }

        public void setDiagnosis(String diagnosis) {
            history.add(new Note(new Date(), "Запись о диагнозе: "+diagnosis));
            this.diagnosis = diagnosis;
        }

        public void addHistory(Date date, String info){
            history.add(new Note(date, info));
        }


        public String getHistory() {
            return history.stream().map(Note::toString).collect(Collectors.joining("\n"));
        }
    }
}