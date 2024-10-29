package org.example.repositories.supermercado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.Supermercado.Marca;
import org.example.models.Supermercado.Ventas;

public class VentasRespository extends AbstractRepository<Ventas> {

    public VentasRespository(EntityManagerFactory emf) {
        super(emf, Ventas.class);
    }
}
