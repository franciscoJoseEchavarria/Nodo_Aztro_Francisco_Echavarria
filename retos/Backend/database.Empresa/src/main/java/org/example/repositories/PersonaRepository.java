package org.example.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.configs.EntityManagerPostgres;
import org.example.models.Persona;

import java.util.List;

public class PersonaRepository {

    private  final EntityManagerPostgres entityManagerPostgres;

    public PersonaRepository (){
        entityManagerPostgres = new EntityManagerPostgres();
    }

    public void create (Persona entity){
        entityManagerPostgres.getEntityManager().getTransaction().begin();
        entityManagerPostgres.getEntityManager().persist(entity);
        entityManagerPostgres.getEntityManager().getTransaction().commit();
        System.out.println("persona creada" );

    }

    public List <Persona> findAll(){
        List<Persona> personas =  entityManagerPostgres.getEntityManager().createQuery("SELECT p FROM Persona p", Persona.class).getResultList();
        return personas;
    }

    public void close (){
        if ( entityManagerPostgres.getEntityManager() != null){
            entityManagerPostgres.getEntityManager().close();
        }
    }

}
