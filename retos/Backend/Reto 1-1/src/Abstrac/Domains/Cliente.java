package Abstrac.Domains;
import Abstrac.Domains2.Viaje;
import Abstrac.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Usuario {

    List <Viaje> destinos = new ArrayList<>();

    public Cliente(int i, String s) {

    }

    public Cliente(int id, String nombre, String apellido, String fechaNacimiento,
                   String direccion, int telefono) {
        super(id, nombre, apellido, fechaNacimiento, direccion, telefono);
        this.destinos = new ArrayList<>();
    }

    //metodo para agregar listas

    public void agregarDestinos(Viaje viaje){
        this.destinos.add(viaje);
    }

    public List<Viaje> getDestinos (){
        return  this.destinos;
    }

}
