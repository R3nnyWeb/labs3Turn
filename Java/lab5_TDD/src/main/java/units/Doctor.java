package units;
//Может заность записи о болезни diseaseRecord пациенту

import records.DiseaseRecord;

import java.util.Objects;

public class Doctor extends People {
    private Specilization specilization;
    private int id;

    public Doctor(String surname, String name, String patronymic, String address, String phone, Specilization specilization, int id) {
        super(surname, name, patronymic, address, phone);
        this.specilization = specilization;
        this.id = id;
    }

    public Specilization getSpecilization() {
        return specilization;
    }

    public void setSpecilization(Specilization specilization) {
        this.specilization = specilization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return id == doctor.id && specilization == doctor.specilization;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specilization, id);
    }

    public void addToMedicalBook(Patient patient, DiseaseRecord diseaseRecord) {
        patient.addToMedicalBook(diseaseRecord);
    }
}
