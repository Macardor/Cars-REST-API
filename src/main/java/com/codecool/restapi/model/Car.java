package com.codecool.restapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;
    private String body;
    private int year;
    private float mass;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Engine> engines;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Wheel> wheels;

    public Car() {
    }

    public Car(String brand, String model, String body, int year, float mass) {
        this.brand = brand;
        this.model = model;
        this.body = body;
        this.year = year;
        this.mass = mass;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }

    public Set<Engine> getEngines() {
        return engines;
    }

    public void setEngines(Set<Engine> engines) {
        this.engines = engines;
    }

    public Set<Wheel> getWheels() {
        return wheels;
    }

    public void setWheels(Set<Wheel> wheels) {
        this.wheels = wheels;
    }
}
