package lab5_var10;

import java.util.Date;

public class HospitalPatient extends PatientInfo implements PatientManager {
    HospitalPatient(String name, String surname, String patronymic) {
        super(name, surname, patronymic);
    }

    HospitalPatient(String name, String surname, String patronymic, String address, String phone) {
        super(name, surname, patronymic, address, phone);
    }

    @Override
    public void makeAnAppointment() {
        getMedBook().addVisiting(new Date(), "Запись к врачу");
    }
    @Override
    public void recordDiagnosis(String diagnosis) {
        getMedBook().setDiagnosis(diagnosis);
        System.out.println("Диагноз пациента стационара записан");
    }
    @Override
    public void recordTreatment(String treatment) {
        getMedBook().setTreatment(treatment);
        System.out.println("Назначенное лечение пациента стационара записано");
    }
    @Override
    public void passTests() {
        getMedBook().addHistory(new Date(), "Лабоаторые исследования сданы");
    }
    @Override
    public String getDiagnosis() {
        return "Диагноз: "+ getMedBook().getDiagnosis();
    }
    @Override
    public String getTreatment() {
        return "Назначенное лечение: "+ getMedBook().getTreatment();
    }
    public String getMedicalHistory() {
        return "История болезни пациента стационара:\n"+
                getMedBook().getHistory();
    }
    @Override
    public void payServices() {
        getMedBook().addHistory(new Date(), "Услуги оплачены");
    }
}