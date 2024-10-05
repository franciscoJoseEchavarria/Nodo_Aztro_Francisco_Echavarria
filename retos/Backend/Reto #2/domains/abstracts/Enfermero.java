package domains.abstracts;

public class Enfermero extends Empleado {

    private String especialidad;

     //Constructores

    public Enfermero() {
    }
    public Enfermero(String name, String lastName, Long salary, String especialidad) {
        super(name, lastName, salary);
        this.especialidad = especialidad;
    }

    @Override
    public void practice() {
        System.out.println("El enfermero esta atendiendo!");
    }

    @Override
    protected void makeGratification() {
        super.setGratification(super.getSalary() * 0.2);
    }

    protected void practice(Paciente paciente) {
        System.out.printf("El medico esta atendiendo al paciente %s ",
                paciente.getLastName());
    }
}

