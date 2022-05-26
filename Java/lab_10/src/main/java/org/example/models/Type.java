package org.example.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;

@Data

public class Type {

    private int id;
    private String name;
    private String language;

    public Type(int id, String name, String language) {
        this.id = id;
        this.name = name;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}
