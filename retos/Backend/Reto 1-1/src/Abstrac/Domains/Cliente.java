package Abstrac.Domains;
import Abstrac.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {

    List <String> destinos = new ArrayList<>();

    public Cliente(int id, String nombre, String apellido, Date fechaNacimiento,
                   String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.destinos = new ArrayList<>();
    }

    //metodo para agregar listas

    public void agregarDestinos(String destino){
        destinos.add(destino);
    }

    public List<String> getDestinos (){
        return  this.destinos;
    }



}
