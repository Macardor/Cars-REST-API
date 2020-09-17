package com.codecool.restapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Wheel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float diameter;
    private float width;

    @ManyToMany(mappedBy = "wheels", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @Transient
    Set<Car> cars;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getDiameter() {
        return diameter;
    }

    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void setCars(Set<Car> cars) {
        this.cars = cars;
    }

}
