package lab5_var10;

public class HospitalPatient extends PatientInfo implements PatientManager {
    String treatment, diagnosis;
    HospitalPatient(String name, String surname, String patronymic) {
        super(name, surname, patronymic);
    }

    HospitalPatient(String name, String surname, String patronymic, String address, String phone) {
        super(name, surname, patronymic, address, phone);
    }

    @Override
    public void makeAnAppointment() {
        System.out.println("Запись на прием к врачу выполнена");
    }
    @Override
    public void recordDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        System.out.println("Диагноз пациента стационара записан");
    }
    @Override
    public void recordTreatment(String treatment) {
        this.treatment = treatment;
        System.out.println("Назначенное лечение пациента стационара записано");
    }
    @Override
    public void passTests() {
        System.out.println("Лабоаторые исследования сданы");
    }
    @Override
    public String GetDiagnosis() {
        return "Вывод диагноза: "+diagnosis;
    }
    @Override
    public String GetTreatment() {
        return "Вывод назначенного лечения: "+treatment;
    }
    @Override
    public String getMedicalHistory() {
        return "Вывод истории болезни пациента стационара";
    }
    @Override
    public void payServices() {
        System.out.println("Услуги оплачены");
    }
}