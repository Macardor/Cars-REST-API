package com.codecool.restapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private float volume;
    private float power;
    private float torque;
    private float emmision;


    public Engine(String name, float volume, float power, float torque, float emmision){
        this.name = name;
        this.volume = volume;
        this.power = power;
        this.torque = torque;
        this.emmision = emmision;
    }

    public Engine(){

    }

    @ManyToMany(mappedBy = "engines", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    @Transient
    Set<Car> cars;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }

    public float getEmmision() {
        return emmision;
    }

    public void setEmmision(float emmision) {
        this.emmision = emmision;
    }
}
