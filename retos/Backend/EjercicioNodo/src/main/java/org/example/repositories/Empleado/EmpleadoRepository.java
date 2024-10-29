package org.example.repositories.Empleado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.empleados.Empleado;

public class EmpleadoRepository extends AbstractRepository<Empleado> {

    public EmpleadoRepository(EntityManagerFactory emf) {
        super(emf, Empleado.class);
    }
}