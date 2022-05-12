package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class City {
    private int id;
    private String name;
    private int year;
    private  int square;

    @Override
    public String toString() {
        return  "[" + id
                +", " + name
                + ", " + year
                +"г. " + square
                +"км^2]";
    }
}
