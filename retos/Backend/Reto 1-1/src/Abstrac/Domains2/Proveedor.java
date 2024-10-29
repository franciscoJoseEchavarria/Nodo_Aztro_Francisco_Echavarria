package Abstrac.Domains2;

public class Proveedor {

    private String id ;
    private String nombrePlataforma;

    public Proveedor(String id, String nombrePlataforma) {
        this.id = id;
        this.nombrePlataforma = nombrePlataforma;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombrePlataforma() {
        return nombrePlataforma;
    }

    public void setNombrePlataforma(String nombrePlataforma) {
        this.nombrePlataforma = nombrePlataforma;
    }
}
