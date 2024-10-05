package domains.abstracts;

public class Medico extends Empleado {

    // Atributo
    private String areaStudio;
    private String speciality;

    // Constructor
    public Medico() {
    }

    public Medico(String name, String lastName, Long salary, String areaStudio) {
        super(name, lastName, salary);
        this.areaStudio = areaStudio;
    }

    private void tesis (){
        System.out.println( "El medico realizo su tesis en hipertension");
    }

    @Override
    public void practice() {
        System.out.println("El medico esta operando!");
    }

    protected Double getGratification(double salary) {
        return 0.1;
    }

    @Override
    public void practice(String name) {
        System.out.println("El medico " + name + " esta en consulta!");
    }

    @Override
    protected void makeGratification() {
        super.setGratification(super.getSalary() * 0.1);
    }

    public void practice(String nombre, Empleado paciente) {
        System.out.printf("El medico %s esta en cita con el paciente %s ",
                nombre,  paciente.getName());
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

}

