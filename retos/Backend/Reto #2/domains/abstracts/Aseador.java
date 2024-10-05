package domains.abstracts;

public class Aseador  extends Empleado {

    private String tipoLimpieza;

    @Override
    public void practice() {
        System.out.println("El aseador esta limpiando!");
    }

    @Override
    protected void makeGratification() {
        super.setGratification(super.getSalary() * 10.0);
    }

    //Constructor

    public Aseador() {
    }

    public Aseador(String name, String lastName, Long salary, String tipoLimpieza) {
        super(name, lastName, salary);
        this.tipoLimpieza = tipoLimpieza;
    }

}