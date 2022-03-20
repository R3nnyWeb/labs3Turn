package services;

import records.VisitRecord;

import java.util.ArrayList;

public class Registry {
    private ArrayList<VisitRecord> visitBook;

    public Registry() {
        visitBook = new ArrayList<>();
    }



    public void addVisitRecord(VisitRecord visitRecord) {
        visitBook.add(visitRecord);
    }

    public ArrayList<VisitRecord> getVisitBook() {
        return visitBook;
    }
}
