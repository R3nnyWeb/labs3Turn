package lab5_var10;

import java.util.Date;

public class CovidPatient extends PatientInfo implements PatientManager{
    private static int covidCounter;
    CovidPatient(String name, String surname, String patronymic) {
        super(name, surname, patronymic);
    }

    CovidPatient(String name, String surname, String patronymic, String address, String phone) {
        super(name, surname, patronymic, address, phone);
    }

    @Override
    public void regPatient(int medCard){
        setMedCard(medCard);
        covidCounter++;
    }
    @Override
    public void makeAnAppointment() {
        getMedBook().addVisiting(new Date(), "Запись к врачу");
    }
    @Override
    public void recordDiagnosis(String diagnosis) {
        getMedBook().setDiagnosis(diagnosis);
        System.out.println("Диагноз пациента с COVID-19 записан");
    }
    @Override
    public void recordTreatment(String treatment) {
        getMedBook().setTreatment(treatment);
        System.out.println("Назначенное лечение пациента с COVID-19 записано");
    }
    @Override
    public void passTests() {
        getMedBook().addHistory(new Date(), "Тест на COVID-19 сдан");
    }
    @Override
    public String getDiagnosis() {
        return "Диагноз: "+ getMedBook().getDiagnosis();
    }
    @Override
    public String getTreatment() {
        return "Назначенное лечение: "+ getMedBook().getTreatment();
    }
    @Override
    public String getMedicalHistory() {
        return "История болезни пациента с COVID-19:\n"+
                getMedBook().getHistory();
    }
    @Override
    public void payServices() {
        getMedBook().addHistory(new Date(), "Услуги оплачены");
    }

    public static int getCovidCounter(){
        return covidCounter;
    }
}