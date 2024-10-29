package Abstrac.Domains;

import Abstrac.Usuario;

import java.util.Date;

public class Administrador extends Usuario {


    String tipoUsuario = "administrador";

    public  Administrador (){

    }

    public Administrador(int id, String nombre, String apellido, String fechaNacimiento, String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
    }


    public String getTipoUsuario (String tipoUsuario){
        return this.tipoUsuario = tipoUsuario ;
    }

}
