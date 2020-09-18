package com.codecool.restapi.dbconnection;

import com.codecool.restapi.model.Car;
import com.codecool.restapi.model.Engine;
import com.codecool.restapi.model.Wheel;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.lang.reflect.Field;
import java.util.*;

public class DaoImpl<T> implements Dao<T> {

    private Class<T> aClass;
    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;

    public DaoImpl(Class<T> aClass) {
        this.aClass = aClass;
    }

    @Override
    public List<T> getAll() {
        initEntityManager();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.aClass);
        Root<T> object = criteriaQuery.from(this.aClass);
        criteriaQuery.select(object);
        TypedQuery<T> query = entityManager.createQuery(criteriaQuery);
        List<T> resultList = query.getResultList();
        closeManagers();
        return resultList;
    }

    @Override
    public T get(long objectId) {
        initEntityManager();
        T receivedObject = entityManager.find(this.aClass, objectId);
        closeManagers();
        return receivedObject;
    }

    @Override
    public void add(T object) {
        initEntityManager();
        try {
            Field objectId = this.aClass.getDeclaredField("id");
            objectId.setAccessible(true);
            if (entityManager.find(this.aClass, objectId.get(object)) == null){
                EntityTransaction transaction = entityManager.getTransaction();
                transaction.begin();
                entityManager.merge(object);
                transaction.commit();
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        closeManagers();
    }

    @Override
    public void update(T object) {
        initEntityManager();
        try {
            Field objectId = this.aClass.getDeclaredField("id");
            objectId.setAccessible(true);
            if (entityManager.find(this.aClass, objectId.get(object)) != null){
                EntityTransaction transaction = entityManager.getTransaction();
                transaction.begin();
                entityManager.merge(object);
                transaction.commit();
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        closeManagers();
    }

    @Override
    public void delete(long objectId) {
        initEntityManager();
        T objectToDelete = entityManager.find(this.aClass, objectId);
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

    public void resetDataBase() {
        initEntityManager();
        closeManagers();
    }

    public static void initRecordsInDatabase() {
        List<Car> cars = new ArrayList<>();
        List<Engine> engines = new ArrayList<>();
        List<Wheel> wheels = new ArrayList<>();
        for(float i=1f; i<21f; i = i + 1f) {
            int z = (int) i;
            String engineName = "E";
            String wheelName = "W";
            for (int om = 0; om < z; om++) {
                engineName += "E";
                wheelName += "W";
            }
            engines.add(new Engine(engineName, i, i, i, i, i));
            wheels.add(new Wheel(i, i, wheelName));
        }

        Dao<Engine> engineDao = new DaoImpl<>(Engine.class);
        Dao<Wheel> wheelDao = new DaoImpl<>(Wheel.class);
        engines.forEach(engineDao::add);
        wheels.forEach(wheelDao::add);

        engines = engineDao.getAll();
        wheels = wheelDao.getAll();
        for(float i=1f; i<21f; i = i + 1f) {
            int z = (int) i;
            String engineName = "E";
            String wheelName = "W";
            for (int om = 0; om < z; om++) {
                engineName += "E";
                wheelName += "W";
            }
            String body = engineName+wheelName;

            Car car = new Car(engineName, wheelName, body, (int) (i + 2000f), i * 200f + 1000f);

            Set<Engine> carEngines = new HashSet<>();
            Set<Wheel> carWheels = new HashSet<>();
            int j = (int) i - 1;
            int k = j + 1;
            int l = j + 2;
            if (j > 19) j = j - 20;
            if (k > 19) k = k - 20;
            if (l > 19) l = l - 20;

            carEngines.add(engines.get(j));
            carWheels.add(wheels.get(j));
            carEngines.add(engines.get(k));
            carWheels.add(wheels.get(k));
            carEngines.add(engines.get(l));
            carWheels.add(wheels.get(l));
            car.setWheels(carWheels);
            car.setEngines(carEngines);

            cars.add(car);
        }

        Dao<Car> carDao = new DaoImpl<>(Car.class);
        cars.forEach(carDao::add);

    }


}
