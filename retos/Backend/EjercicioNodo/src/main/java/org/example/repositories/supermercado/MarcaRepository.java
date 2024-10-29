package org.example.repositories.supermercado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.Supermercado.Marca;

public class MarcaRepository extends AbstractRepository<Marca> {

    public MarcaRepository(EntityManagerFactory emf) {
        super(emf, Marca.class);
    }
}
