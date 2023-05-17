package com.spring.databaseApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;

@Entity
public class Alien {
    private String name;
    private String tech;
    @Id
    private int id;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", tech='" + tech + '\'' +
                ", id=" + id +
                '}';
    }
}
