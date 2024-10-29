package org.example.repositories.Empleado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.empleados.Salario;

public class SalarioRepository extends AbstractRepository<Salario> {

    public SalarioRepository(EntityManagerFactory emf) {
        super(emf, Salario.class);
    }
}
