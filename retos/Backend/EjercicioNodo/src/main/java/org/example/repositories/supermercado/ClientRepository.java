package org.example.repositories.supermercado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.Supermercado.Cliente;

public class ClientRepository extends AbstractRepository<Cliente> {

    public ClientRepository(EntityManagerFactory emf) {
        super(emf, Cliente.class);
    }
}