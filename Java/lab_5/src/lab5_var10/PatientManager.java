package lab5_var10;

public interface PatientManager extends PatientInfoManager{
    default void regPatient(int medCard){
        setMedCard(medCard);
    }
    void issueContract();
    void stopContract();
    void continueContract();
    void makeAnAppointment();
    void recordDiagnosis();
    void recordTreatment();
    void passTests();
    String GetDiagnosis();
    String GetTreatment();
    String getMedicalHistory();
    void payServices();
}
