package records;
import units.*;
//Записи к доктору

import java.util.Objects;

public class VisitRecord extends MedicalRecord {
    private Patient patient;
    private Doctor doctor;
    private String cabinet;

    public VisitRecord(String date, Patient patient, Doctor doctor, String cabinet) {
        super(date);
        this.patient = patient;
        this.doctor = doctor;
        this.cabinet = cabinet;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VisitRecord that = (VisitRecord) o;
        return Objects.equals(patient, that.patient) && Objects.equals(doctor, that.doctor) && Objects.equals(cabinet, that.cabinet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), patient, doctor, cabinet);
    }

    @Override
    public String toString() {
        return "\nДата: " + super.getDate() + ",  Пациент: " + patient + ",  Врач: " + doctor + ", Кабинет: " + cabinet;
    }

}
