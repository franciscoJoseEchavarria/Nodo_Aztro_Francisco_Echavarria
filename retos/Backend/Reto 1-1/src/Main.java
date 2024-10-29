import Abstrac.Domains.Administrador;
import Abstrac.Domains.Cliente;
import Abstrac.Domains.GestorViajes;
import Abstrac.Domains2.Viaje;
import Abstrac.Usuario;

import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {

        //Crea lista para almacenar datos de las personas
        List < Usuario> listaPersonas = new ArrayList<>();

        //Crea instancias de cliente, administrador y gesto de viajes

        Map <Integer, Usuario> mapaPersonas = new HashMap<>();

        // Crear instancias de Cliente, Administrador y GestorDeViajes

        Cliente cliente = new Cliente(1, "Juan", "Pérez", "05-20", "Calle 123", 555 - 1234);
        Administrador admin = new Administrador(2, "Ana", "García", "1985-08-15", "Calle 456", 555 - 5678);
        GestorViajes gestor = new GestorViajes(3, "Luis", "Martínez", "1992-11-30", "Calle 789", 555 - 7890);

        // Crar instancias de viajes
        Viaje viaje1 = new Viaje(1, "París");
        Viaje viaje2 = new Viaje(1, "Cucuta");



        // Agregar los viajes al cliente
        cliente.agregarDestinos((viaje1));
        cliente.agregarDestinos((viaje2));


        //agregar a las persona en las listas

        listaPersonas.add(cliente);
        listaPersonas.add(admin);
        listaPersonas.add(gestor);

        // Agregar a las personas al mapa usando el id como clave
        mapaPersonas.put(cliente.getId(), cliente);
        mapaPersonas.put(admin.getId(), admin);
        mapaPersonas.put(gestor.getId(), gestor);

        System.out.println("Lista de personas:");
        for (Usuario persona : listaPersonas) {
            System.out.println(persona.getNombre() + " " + persona.getApellido() + " (ID: " + persona.getId() + ")");
        }

        // Mostrar información del mapa accediendo por id
        System.out.println("\nMapa de personas (accediendo por id):");
        for (Map.Entry<Integer, Usuario> entry : mapaPersonas.entrySet()) {
            Usuario persona = entry.getValue();
            System.out.println("ID: " + entry.getKey() + " - " + persona.getNombre() + " " + persona.getApellido());
        }

        System.out.println("\nDestinos del cliente:");
        for (Viaje destino : cliente.getDestinos()) {
            System.out.println(destino);
        }
    }

}
