package units;
//Кроме основных полей имеет  медкнижку medicalBook в котором могут храниться всe medicalRecords

import records.DiseaseRecord;
import records.MedicalRecord;

import java.util.ArrayList;
import java.util.Objects;

public class Patient extends People {
    private int id;
    private int cardNumber;
    private ArrayList<MedicalRecord> medicalBook;



    public Patient(String surname, String name, String patronymic, int id, int cardNumber) {
        super(surname, name, patronymic);
        this.id = id;
        this.cardNumber = cardNumber;
        medicalBook = new ArrayList<>();
    }

    public Patient(String surname, String name, String patronymic, String address, String phone, int id, int cardNumber) {
        super(surname, name, patronymic, address, phone);
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public ArrayList<MedicalRecord> getMedicalBook() {
        return medicalBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() !=  o.getClass()) return false;
        if (!super.equals(o)) return false;
        Patient patient = (Patient) o;
        return id == patient.id && cardNumber == patient.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, cardNumber);
    }

    @Override
    public String toString() {
        return super.toString() + "\n id: " + id + "\n Номер медкарточки: "+ cardNumber;
    }

    public void addToMedicalBook(MedicalRecord medicalRecord){
        medicalBook.add(medicalRecord);
    }

}
