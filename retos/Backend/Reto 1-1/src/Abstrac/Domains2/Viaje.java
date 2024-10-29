package Abstrac.Domains2;

public class Viaje {

    private int id ;
    private String ciudad;

    public Viaje (){

    }

    public Viaje (int id, String ciudad){
        this.id = id;
        this.ciudad = ciudad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Viaje{id=" + this.id + ", nombreCiudad='" + this.ciudad + "'}";
    }

}
