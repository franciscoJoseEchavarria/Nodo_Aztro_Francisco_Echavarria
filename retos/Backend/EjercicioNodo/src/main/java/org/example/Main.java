package org.example;

import io.github.cdimascio.dotenv.Dotenv;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.Supermercado.*;
import org.example.repositories.supermercado.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dotenv dotenv = Dotenv.configure().load();

        System.setProperty("jakarta.persistence.jdbc.url", dotenv.get("DB_URL"));
        System.setProperty("jakarta.persistence.jdbc.user", dotenv.get("DB_USER"));
        System.setProperty("jakarta.persistence.jdbc.password", dotenv.get("DB_PASSWORD"));

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");

        ClientRepository clientRepository = new ClientRepository(emf);
        MarcaRepository marcaRepository = new MarcaRepository(emf);
        ProductoRepository productoRepository = new ProductoRepository(emf);
        VentasRespository ventasRepository = new VentasRespository(emf);

        Cliente cliente = new Cliente();
        cliente.setNombre("Francisco");
        cliente.setApellido("Echavarria");
        clientRepository.save(cliente);

        Marca marca = new Marca();
        marca.setNombre("Nike");
        marcaRepository.save(marca);

        Producto producto1 = new Producto();
        producto1.setNombre("Zapatos");
        producto1.setPrecio(100.0);
        producto1.setMarca(marca);
        productoRepository.save(producto1);

        Producto producto2 = new Producto();
        producto2.setNombre("Ropa");
        producto2.setPrecio(50.0);
        producto2.setMarca(marca);
        productoRepository.save(producto2);

        Ventas venta1 = new Ventas();
        venta1.setCliente(cliente);
        venta1.setProducto(producto1); // Corregido
        venta1.setCantidad(2);
        venta1.setTotal(producto1.getPrecio() * venta1.getCantidad());
        ventasRepository.save(venta1);

        Ventas venta2 = new Ventas();
        venta2.setCliente(cliente);
        venta2.setProducto(producto2); // Corregido
        venta2.setCantidad(3);
        venta2.setTotal(producto2.getPrecio() * venta2.getCantidad());
        ventasRepository.save(venta2);

        List<Cliente> clientes = clientRepository.findAll();
        for (Cliente c : clientes) {
            System.out.println("Cliente: " + c.getNombre() + " " + c.getApellido());
            // Inicializar las ventas dentro de una sesión activa
            EntityManager em = emf.createEntityManager();
            em.getTransaction().begin();
            c = em.find(Cliente.class, c.getId());
            for (Ventas v : c.getVentas()) {
                System.out.println("Venta: " + v.getProducto().getNombre() + ", Cantidad: " + v.getCantidad() + ", Total: " + v.getTotal());
            }
            em.getTransaction().commit();
            em.close();


        }
    }
}