package records;

import java.util.Objects;

public class DiseaseRecord extends MedicalRecord {

    private String diagnosis;
    private String treatment;
    private String convalescenceTime;

    public DiseaseRecord(String date, String diagnosis, String treatment, String convalescenceTime) {
        super(date);
        this.diagnosis = diagnosis;
        this.treatment = treatment;
        this.convalescenceTime = convalescenceTime;
    }

    public String getConvalescenceTime() {
        return convalescenceTime;
    }

    public void setConvalescenceTime(String convalescenceTime) {
        this.convalescenceTime = convalescenceTime;
    }


    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }


    @Override
    public String toString() {
        return "Дата: " + super.getDate() + ",  Диагноз: " + diagnosis + ",  Лечение: " + treatment + ", Время лечения: " + convalescenceTime;
    }
}
