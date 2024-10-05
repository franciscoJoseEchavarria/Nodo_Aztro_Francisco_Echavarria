package Abstrac.Domains;

import Abstrac.Usuario;

import java.util.Date;

public class GestorViajes extends Usuario {

    public GestorViajes(int id, String nombre, String apellido, Date fechaNacimiento, String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }
}
