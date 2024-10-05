package Abstrac.Domains;

import Abstrac.Usuario;

import java.util.Date;

public class Administrador extends Usuario {


    public Administrador(int id, String nombre, String apellido, Date fechaNacimiento, String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }



}
