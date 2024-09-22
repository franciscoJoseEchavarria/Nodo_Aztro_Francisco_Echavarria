package org.example.domains;

import org.example.domains.abstracts.Empleado;

public class Medico extends Empleado {

  //atributo

  private String speciality;

  //Constructor
  public Medico() {
  }

  //sobrecarga de constructor
  public Medico(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

  //sobreescribiendo métodos

  @Override
  public void practice() {
    System.out.println("El medico esta operando!");
  }

  //metodos propios de la clase
  protected Double getGratification(double salary) {
    return 0.1;
  }

  //sobreescribiendo metodos

  @Override
  public void practice(String name) {
    System.out.println("El medico " + name + " esta en consulta!");
  }

  @Override
  protected void makeGratification() {
    super.setGratification(super.getSalary() * 0.1);
  }

  // Metodo que no devuelve nada.

  public void practice(String nombre, Empleado paciente) {
    System.out.printf("El medico %s esta en cita con el paciente %s ",
        nombre,  paciente.getName());
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

}
