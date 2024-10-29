package org.example.repositories.Empleado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.empleados.Departamento;

public class DepartamentoRepository extends AbstractRepository<Departamento> {

    public DepartamentoRepository(EntityManagerFactory emf) {
        super(emf, Departamento.class);
    }
}