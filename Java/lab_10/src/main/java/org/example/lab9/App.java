package org.example.lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Long startArrayListTime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            arrayList.add(random.nextInt());
        }
        Long endArrayListTime = System.currentTimeMillis();
        System.out.println("Время созждания 1 000 000 эл в arrayList " + (endArrayListTime-startArrayListTime) + " мс");
        //=======//
        LinkedList<Integer> linkedList = new LinkedList<>();
        Long startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            linkedList.add(random.nextInt());
        }
        Long endLinkedListTime = System.currentTimeMillis();
        System.out.println("Время созждания 1 000 000 эл в linkedList " + (endLinkedListTime-startLinkedListTime) + " мс");

        //====//
        startArrayListTime = System.currentTimeMillis();

        for (int i = 0; i <1000000 ; i++) {
            arrayList.add(random.nextInt());
        }
        endArrayListTime = System.currentTimeMillis();
        System.out.println("Время добавления 1 000 000 эл в arrayList " + (endArrayListTime-startArrayListTime) + " мс");

        //=====//
         startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i <1000000 ; i++) {
            linkedList.add(random.nextInt());
        }
        endLinkedListTime = System.currentTimeMillis();
        System.out.println("Время add 1 00 000 эл в linkedList " + (endLinkedListTime-startLinkedListTime) + " мс");
        //===//
        startArrayListTime = System.currentTimeMillis();

        for (int i = 0; i <10000 ; i++) {
            arrayList.indexOf(random.nextInt());
        }
        endArrayListTime = System.currentTimeMillis();
        System.out.println("Время поиска 10000 эл в arrayList " + (endArrayListTime-startArrayListTime) + " мс");

        //====//
        startLinkedListTime = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            linkedList.indexOf(random.nextInt());
        }
        endLinkedListTime = System.currentTimeMillis();
        System.out.println("Время поиска 10000 эл в linkedList " + (endLinkedListTime-startLinkedListTime) + " мс");

    }
}
