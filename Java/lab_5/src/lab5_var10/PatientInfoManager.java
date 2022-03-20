package lab5_var10;

public interface PatientInfoManager {
    String getName();
    void setName(String name);
    String getSurname();
    void setSurname(String surname);
    String getPatronymic();
    void setPatronymic(String patronymic);
    String getAddress();
    void setAddress(String address);
    String getPhone();
    void setPhone(String phone);
    int getMedCard();
    void setMedCard(int medCard);
    int getId();
}