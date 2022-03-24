package lab5_var10;

public class CovidPatient extends PatientInfo implements PatientManager{
    private String treatment, diagnosis;
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
        System.out.println("Запись на прием к врачу выполнена");
    }
    @Override
    public void recordDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
        System.out.println("Диагноз пациента с COVID-19 записан");
    }
    @Override
    public void recordTreatment(String treatment) {
        this.treatment = treatment;
        System.out.println("Назначенное лечение пациента с COVID-19 записано");
    }
    @Override
    public void passTests() {
        System.out.println("Тест на COVID-19 сдан");
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
        return "Вывод истории болезни пациента с COVID-19";
    }
    @Override
    public void payServices() {
        System.out.println("Услуги оплачены");
    }

    public static int getCovidCounter(){
        return covidCounter;
    }
}