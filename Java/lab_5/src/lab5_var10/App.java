package lab5_var10;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {
        ArrayList<PatientManager> patients = getPatients();
        System.out.println("Выводим всю информацию:");
        printInfo(patients, PatientManager::toString);
        System.out.println("Выводим информацию в формате:");
        System.out.println("ID: история болезни");
        printInfo(patients, p -> p.getId() + ": " + p.getMedicalHistory());
        System.out.println("Процент заболевших COVID-19: "+
                (double)CovidPatient.getCovidCounter()/PatientInfo.getNumOfPatient()*100+"%");
    }

    public static void printInfo(ArrayList<PatientManager> patients, Function<PatientManager, String> action){
        patients.forEach(patient -> System.out.println(action.apply(patient)));
    }

    public static ArrayList<PatientManager> getPatients(){
        ArrayList<PatientManager> arr = new ArrayList<PatientManager>();
        arr.add(new HospitalPatient("Иванов", "Иван", "Иванович", "г.Рязань", "8 (123) 456-78-90"));
        arr.add(new CovidPatient("Петров", "Николай", "Петрович","г.Москва", "8 (965) 616-30-59"));
        arr.add(new CovidPatient("Сидоров", "Василий", "Александрович"));
        arr.get(arr.size()-1).setAddress("г.Владимир");
        arr.add(new HospitalPatient("Кузнецов", "Андрей", "Михайлович"));
        arr.add(new CovidPatient("Козлов", "Сергей", "Сергеевич"));
        arr.get(arr.size()-1).setPhone("8 (995) 483-36-07");
        Random random = new Random();
        arr.forEach(patient -> patient.regPatient(Math.abs(random.nextInt())));
        return arr;
    }
}