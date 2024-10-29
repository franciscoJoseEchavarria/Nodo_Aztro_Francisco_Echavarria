package org.example.repositories.Empleado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.empleados.Proyecto;

public class ProyectoRepository extends AbstractRepository<Proyecto> {

    public ProyectoRepository(EntityManagerFactory emf) {
        super(emf, Proyecto.class);
    }
}