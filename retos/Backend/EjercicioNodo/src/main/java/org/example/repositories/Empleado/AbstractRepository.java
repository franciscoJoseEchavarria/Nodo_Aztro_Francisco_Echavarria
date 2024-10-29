package org.example.repositories.Empleado;

import jakarta.persistence.*;
import java.util.List;

public abstract class AbstractRepository<T> {

    private final EntityManagerFactory emf;
    private final Class<T> entityClass;

    public AbstractRepository(EntityManagerFactory emf, Class<T> entityClass) {
        this.emf = emf;
        this.entityClass = entityClass;
    }

    public void save(T entity) {
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(entity);
        transaction.commit();
        entityManager.close();
    }

    public T findById(long id) {
        EntityManager entityManager = emf.createEntityManager();
        T entity = entityManager.find(entityClass, id);
        entityManager.close();
        return entity;
    }

    public List<T> findAll() {
        EntityManager entityManager = emf.createEntityManager();
        TypedQuery<T> query = entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass);
        List<T> entities = query.getResultList();
        entityManager.close();
        return entities;
    }
}