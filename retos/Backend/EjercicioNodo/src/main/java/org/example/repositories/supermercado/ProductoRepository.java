package org.example.repositories.supermercado;

import jakarta.persistence.EntityManagerFactory;
import org.example.models.Supermercado.Marca;
import org.example.models.Supermercado.Producto;

public class ProductoRepository extends AbstractRepository<Producto> {

    public ProductoRepository (EntityManagerFactory emf) {
        super(emf, Producto.class);
    }
}
