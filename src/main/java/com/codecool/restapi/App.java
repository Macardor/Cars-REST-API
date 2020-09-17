package com.codecool.restapi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.codecool.restapi.model.*;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("restPU");
        EntityManager em = emf.createEntityManager();

        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        Car car = new Car("Audi", "A1", "Sportback", 2020, 1190f);
        em.persist(car);
        transaction.commit();
        em.close();
        emf.close();

    }
}