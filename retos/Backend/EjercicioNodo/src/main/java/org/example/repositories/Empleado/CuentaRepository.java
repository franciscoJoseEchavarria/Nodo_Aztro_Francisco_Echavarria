package org.example.repositories.Empleado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.empleados.Cuenta;

public class CuentaRepository extends AbstractRepository<Cuenta> {

    public CuentaRepository(EntityManagerFactory emf) {
        super(emf, Cuenta.class);
    }
}