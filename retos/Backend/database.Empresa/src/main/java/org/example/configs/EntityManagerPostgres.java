package org.example.configs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lombok.Getter;
import org.hibernate.engine.spi.PersistenceContext;

public class EntityManagerPostgres {
    @Getter
    private final EntityManagerFactory entityManagerFactory;
    @Getter
    private final EntityManager entityManager;

    public EntityManagerPostgres (){
        this.entityManagerFactory = Persistence.createEntityManagerFactory("myPU");
        this.entityManager = entityManagerFactory.createEntityManager();
    }


}
