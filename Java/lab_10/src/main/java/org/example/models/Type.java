package org.example.models;

import lombok.Data;

@Data
public class Type {
    private int id;
    private String name;
    private String language;

    @Override
    public String toString() {
        return  "[" + id
                +", " + name
                + ", " + language
                +"]";
    }
}
