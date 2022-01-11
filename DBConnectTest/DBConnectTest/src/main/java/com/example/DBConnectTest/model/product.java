package com.example.DBConnectTest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class product {
    @Id
    private int id;
    private String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public product(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public product(){}
}
