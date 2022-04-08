package lab5_var10;

public interface PatientManager extends PatientInfoManager{
    default void regPatient(int medCard){
        setMedCard(medCard);
    }
    default void issueContract(){
        System.out.println("Договор оформлен");
    }
    default void stopContract() {
        System.out.println("Отказ от обслуживания выполнен");
    }
    default void continueContract() {
        System.out.println("Обслуживание возобновлено");
    }
    void makeAnAppointment();
    void recordDiagnosis(String diagnosis);
    void recordTreatment(String treatment);
    void passTests();
    String getDiagnosis();
    String getTreatment();
    String getMedicalHistory();
    void payServices();
}