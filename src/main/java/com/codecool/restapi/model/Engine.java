package com.codecool.restapi.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float volume;
    private float torque;

    public Engine(float volume, float torque){
        this.volume = volume;
        this.torque = torque;
    }

    public Engine(){

    }

    @ManyToMany(mappedBy = "engines", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    Set<Car> cars;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getVolume() {
        return volume;
    }

    public void setVolume(float volume) {
        this.volume = volume;
    }

    public float getTorque() {
        return torque;
    }

    public void setTorque(float torque) {
        this.torque = torque;
    }
}
