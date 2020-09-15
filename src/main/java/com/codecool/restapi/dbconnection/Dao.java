package com.codecool.restapi.dbconnection;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Dao<T> {

    public List<T> getAll(Class<T> objectClass) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(objectClass);
        Root<T> object = criteriaQuery.from(objectClass);
        criteriaQuery.select(object);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        List<T> resultList = query.getResultList();
        entityManager.close();
        entityManagerFactory.close();
        return resultList;
    }

    public T get(Class<T> objectClass, long objectId) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        T receivedObject = entityManager.find(objectClass, objectId);
        entityManager.close();
        entityManagerFactory.close();
        return receivedObject;
    }

    public void add(T objectToAdd) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(objectToAdd);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void update(T object, Class<T> objectClass) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaUpdate<T> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(objectClass);
        Root<T> objectRoot = criteriaUpdate.from(objectClass);
        Field[] fields = object.getClass().getFields();
        Field idField = Arrays.stream(fields)
                .peek(field -> field.setAccessible(true))
                .filter(field -> field.getName().equals("id"))
                .findFirst()
                .get();
        List<Field> objectFields = Arrays.stream(fields)
                .filter(f -> !f.getName().equals("id"))
                .collect(Collectors.toList());
        try {
            for (Field objectField : objectFields) {
                criteriaUpdate.set(objectField.getName(), objectField.get(object));
            }
            criteriaUpdate.where(criteriaBuilder.equal(objectRoot.get("id"), idField.get(object)));
            entityManager.createQuery(criteriaUpdate).executeUpdate();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        entityManager.close();
        entityManagerFactory.close();
    }

    public void delete(T object) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(object);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

    public void delete(Class<T> objectClass, long objectId) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("restPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        T objectToDelete = entityManager.find(objectClass, objectId);
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.remove(objectToDelete);
        transaction.commit();
        entityManager.close();
        entityManagerFactory.close();
    }

}
