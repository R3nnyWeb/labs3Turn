import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Timer;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        Long startArrayListTime = System.currentTimeMillis();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<1000000; i++){
            arrayList.add(random.nextInt());
        }
        Long endArrayListTime = System.currentTimeMillis();
        System.out.println("Время создания ArrayList "+(endArrayListTime-startArrayListTime)+" мс");

        Long startHashMapTime = System.currentTimeMillis();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < 1000000; i++) {
            hashMap.put(i, random.nextInt());
        }
        Long endHashMapTime = System.currentTimeMillis();
        System.out.println("Время создания HashMap "+(endHashMapTime-startHashMapTime)+ " мс");
///////////
        ArrayList<Integer> tmpArrayList = new ArrayList<>();
        for (int i=0; i<100000; i++){
            tmpArrayList.add(random.nextInt());
        }
        startArrayListTime = System.currentTimeMillis();
        arrayList.addAll(tmpArrayList);
        endArrayListTime = System.currentTimeMillis();
        System.out.println("Время добавления в ArrayList "+(endArrayListTime-startArrayListTime)+" мс");

        HashMap<Integer, Integer> tmpHashMap = new HashMap<>();
        for (int i = 1000000; i < 1100000; i++) {
            tmpHashMap.put(i, random.nextInt());
        }
        startHashMapTime = System.currentTimeMillis();
        hashMap.putAll(tmpHashMap);
        endHashMapTime = System.currentTimeMillis();
        System.out.println("Время добавления в HashMap "+(endHashMapTime-startHashMapTime)+ " мс");

        /////////////
        startArrayListTime = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            arrayList.indexOf(random.nextInt());
        }
        endArrayListTime = System.currentTimeMillis();
        System.out.println("Время поиска в ArrayList "+(endArrayListTime-startArrayListTime)+" мс");

        startHashMapTime = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            hashMap.containsValue(random.nextInt());
        }
        endHashMapTime = System.currentTimeMillis();
        System.out.println("Время поиска в HashMap "+(endHashMapTime-startHashMapTime)+ " мс");

        startHashMapTime = System.currentTimeMillis();
        for (int i=0; i<10000; i++){
            hashMap.get(random.nextInt(1100000));
        }
        endHashMapTime = System.currentTimeMillis();
        System.out.println("Время поиска в HashMap "+(endHashMapTime-startHashMapTime)+ " мс");
    }
}