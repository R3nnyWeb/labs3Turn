package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Value;

import java.util.ArrayList;
import java.util.Map;

@Data

public class City {

    public City(int id, String name, int year, int square, Map<Type, String> types) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.square = square;
        this.types = types;
    }

    private int id;
    private String name;
    private int year;
    private  int square;

    private Map<Type, String> types;

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", square=" + square +
                ", types=" + types +
                '}' + "\n";
    }
}
