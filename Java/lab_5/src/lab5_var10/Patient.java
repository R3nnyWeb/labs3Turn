package lab5_var10;

public class Patient extends PatientInfo implements PatientManager{

    Patient(String name, String surname, String patronymic){
        super(name,surname, patronymic);
    }

    Patient(String name, String surname, String patronymic, String address, String phone){
        super(name,surname, patronymic, address, phone);
    }

        @Override
    public void issueContract() {
        System.out.println("Договор оформлен");
    }

    @Override
    public void stopContract() {
        System.out.println("Отказ от обслуживания выполнен");
    }

    @Override
    public void continueContract() {
        System.out.println("Обслуживание возобновлено");
    }

    @Override
    public void makeAnAppointment() {

    }

    @Override
    public void recordDiagnosis() {

    }

    @Override
    public void recordTreatment() {

    }

    @Override
    public void passTests() {
        System.out.println("Лабоаторые исследования сданы");
    }

    @Override
    public String GetDiagnosis() {
        return null;
    }

    @Override
    public String GetTreatment() {
        return null;
    }

    @Override
    public String getMedicalHistory() {
        return null;
    }

    @Override
    public void payServices() {
        System.out.println("Услуги оплачены");
    }
}
