package Abstrac.Domains;

import Abstrac.Usuario;

import java.util.Date;

public class GestorViajes extends Usuario {

    String tipoUsuario = "gestor de viajes";

    public GestorViajes (){

    }

    public GestorViajes(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }
}
