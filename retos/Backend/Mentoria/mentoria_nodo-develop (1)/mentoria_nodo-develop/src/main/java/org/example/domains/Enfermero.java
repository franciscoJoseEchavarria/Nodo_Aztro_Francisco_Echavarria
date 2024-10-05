package org.example.domains;

import org.example.domains.abstracts.Empleado;

public class Enfermero extends Empleado {

  public Enfermero() {
  }

  public Enfermero(String name, String lastName, Long salary) {
    super(name, lastName, salary);
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
