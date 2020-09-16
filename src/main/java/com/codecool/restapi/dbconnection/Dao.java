package com.codecool.restapi.dbconnection;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class Dao<T> {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public List<T> getAll(Class<T> objectClass) {
        initEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(objectClass);
        Root<T> object = criteriaQuery.from(objectClass);
        criteriaQuery.select(object);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        List<T> resultList = query.getResultList();
        closeManagers();
        return resultList;
    }

    public T get(Class<T> objectClass, long objectId) {
        initEntityManager();
        T receivedObject = entityManager.find(objectClass, objectId);
        closeManagers();
        return receivedObject;
    }

    public void add(T objectToAdd) {
        initEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(objectToAdd);
        transaction.commit();
        closeManagers();
    }

    public void update(T object) {
        initEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(object);
        transaction.commit();
        closeManagers();
    }

    public void delete(Class<T> objectClass, long objectId) {
        initEntityManager();
        T objectToDelete = entityManager.find(objectClass, objectId);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(objectToDelete);
        transaction.commit();
        closeManagers();
    }

    private void initEntityManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        entityManager = entityManagerFactory.createEntityManager();
    }

    private void closeManagers() {
        entityManager.close();
        entityManagerFactory.close();
    }

}
