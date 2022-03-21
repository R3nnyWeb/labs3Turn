package services;

//Заключать контракт, возвращая нового пациента, заносить информацию об посещениях как в саму регистратуру,
//так и в медкнижку пациента, может возвращать записи о посещениях, болезнях любого пациента, принимать лабораторные тесты и заносить их
//как в саму регистратуру, так и в карточку пациента, возвращать медкарту пациента, принимать оплату от пациента.

import records.DiseaseRecord;
import records.MedicalRecord;
import records.VisitRecord;
import units.Patient;

import java.util.ArrayList;

public class Registry {
    private ArrayList<VisitRecord> visitBook;

    public Registry() {
        visitBook = new ArrayList<>();
    }



    public void addVisitRecord(VisitRecord visitRecord) {
        visitBook.add(visitRecord);
        visitRecord.getPatient().addToMedicalBook(visitRecord);
    }

    public ArrayList<VisitRecord> getVisitBook() {
        return visitBook;
    }

    public Patient signContract(String surname, String name, String patronymic, int id, int cardNumber) {
        return new Patient(surname,name,patronymic,id,cardNumber);
    }

    public Patient signContract(String surname, String name, String patronymic, String address, String phone, int id, int cardNumber){
        return new Patient(surname,name,patronymic,address,phone,id,cardNumber);
    }

    public ArrayList<MedicalRecord> getMedicalBook(Patient patient) {
        return patient.getMedicalBook();
    }

    public ArrayList<DiseaseRecord> getDiseaseBook(Patient patient) {
        ArrayList<MedicalRecord> medicalRecords = patient.getMedicalBook();
        ArrayList<DiseaseRecord> diseaseRecords = new ArrayList<>();
        for (MedicalRecord medicalRecord : medicalRecords) {
            if (medicalRecord instanceof DiseaseRecord) {
                diseaseRecords.add((DiseaseRecord) medicalRecord);
            }
        }
        return diseaseRecords;
    }
}
