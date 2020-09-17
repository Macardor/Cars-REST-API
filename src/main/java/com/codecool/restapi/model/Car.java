package com.codecool.restapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private float fuelUsage;
    private float mass;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Engine> engines;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Wheel> wheels;

    public Car() {
    }

    public Car(String brand, float fuelUsage, float mass) {
        this.brand = brand;
        this.fuelUsage = fuelUsage;
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

    public float getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(float fuelUsage) {
        this.fuelUsage = fuelUsage;
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
