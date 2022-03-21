
import records.MedicalRecord;
import units.*;
import org.junit.jupiter.api.Test;
import records.DiseaseRecord;
import records.VisitRecord;
import services.Registry;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testPeopleEquals(){
        People people = new People("Иванов", "Иван", "Иванович");
        People secondPeople = new People("Иванов", "Иван", "Иванович");
        assertEquals(people, secondPeople);
        assertNotEquals(people, new People("", "", ""));
        assertNotEquals(people, new People("Иванов", "Иван", "Иванович", "Иваново", "+790909503"));
    }

    @Test
    public void testAddressPhoneNotEmpty(){
        People people = new People("Иванов", "Иван", "Иванович");
        assertNotNull(people.getAddress());
        assertNotNull(people.getPhone());
    }

    @Test
    public void  testToStringPeople(){
        People people = new People("Иванов", "Иван", "Иванович", "Иваново", "+790909503");
        String expected = new String(" ФИО: Иванов Иван Иванович\n" +
                " Адрес: Иваново\n" +
                " Телефон: +790909503");
        assertEquals(expected, people.toString());
    }
    @Test
    public void testPatientEquals(){
        Patient patient = new Patient("Иванов", "Иван", "Иванович", 0,0);
        assertEquals(patient, new Patient("Иванов", "Иван", "Иванович", 0,0));
        assertNotEquals(patient, new Patient("Иванов", "Иван", "Иванович", 1,0));
        assertNotEquals(patient, new People("Иванов", "Иван", "Иванович"));
    }



    @Test
    void testDoctorCanAddDiseaseToPatientMedicalBook() {
        Registry registry = new Registry();
        Patient patient = registry.signContract("Иванов", "Иван", "Иванович",0,0);
        Doctor doctor = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,1);
        DiseaseRecord diseaseRecord = new DiseaseRecord("19.03.2022", "Усталость", "Много спать и кущать", "5 дней");
        doctor.addToMedicalBook(patient, diseaseRecord);
        ArrayList<MedicalRecord> medicalRecords = registry.getMedicalBook(patient);
        assertEquals(diseaseRecord, medicalRecords.get(0));

    }
    @Test
    void testRegistryCanAddVisitToPatientMedicalBook(){
        Registry registry = new Registry();
        Doctor doctor = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,1);
        Patient patient = registry.signContract("Иванов", "Иван", "Иванович",0,0);
        VisitRecord visitRecord = new VisitRecord("19.03.2022", patient,doctor, "256А");
        registry.addVisitRecord(visitRecord);
        assertEquals(registry.getVisitBook().get(0), visitRecord);
        assertEquals(patient.getMedicalBook().get(0), visitRecord);
    }
    @Test
    void testRegistryCanGetDiseaseBook(){
            Registry registry = new Registry();
            Patient patient = registry.signContract("Иванов", "Иван", "Иванович",0,0);
            Doctor doctor = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,1);
            DiseaseRecord diseaseRecord = new DiseaseRecord("19.03.2022", "Усталость", "Много спать и кущать", "5 дней");
            DiseaseRecord diseaseRecord1 = new DiseaseRecord("20.03.2022", "Живот болит", "Много спать и кущать", "2 дней");
            ArrayList<DiseaseRecord> diseaseRecords = new ArrayList<>(){
            {
                add(diseaseRecord);
                add(diseaseRecord1);
            }
        };
            doctor.addToMedicalBook(patient,diseaseRecord);
            doctor.addToMedicalBook(patient,diseaseRecord1);
             VisitRecord visitRecord = new VisitRecord("19.03.2022", patient,doctor, "256А");
             registry.addVisitRecord(visitRecord);
            System.out.println(patient.getMedicalBook().toString());
            assertEquals(diseaseRecords, registry.getDiseaseBook(patient));
    }

    @Test
    void testDoctorEquals(){
        Doctor doctor = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,1);
        Doctor doctor1 = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,1);
        Doctor doctor2 = new Doctor("Иванов", "Иван", "Иванович", "Иваново", "+790909503",  Specilization.THERAPIST,2);
        assertEquals(doctor, doctor1);
        assertNotEquals(doctor,doctor2);
    }


    @Test
    void testRegistryCanMakePatients(){
        Registry registry = new Registry();
        Patient patient = registry.signContract("Иванов", "Иван", "Иванович", 0,0);
        Patient patient1 = registry.signContract("Иванов", "Иван", "Иванович", "Иваново", "+790909503",0,0);
        assertEquals(patient, new Patient("Иванов", "Иван", "Иванович", 0,0));
        assertEquals(patient1, new Patient("Иванов", "Иван", "Иванович", "Иваново", "+790909503",0,0));
    }

}
