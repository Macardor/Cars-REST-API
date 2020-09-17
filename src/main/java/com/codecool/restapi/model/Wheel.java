package com.codecool.restapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class Wheel {

    @Id
    @GeneratedValue
    private float id;
    private float diameter;
    private float width;

    @ManyToMany(mappedBy = "wheels")
    Set<Car> cars;

    public float getId() {
        return id;
    }

    public void setId(float id) {
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
}
