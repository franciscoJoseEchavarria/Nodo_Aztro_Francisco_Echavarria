package org.example.domains;

import org.example.domains.abstracts.Empleado;

public class Aseador extends Empleado {

  @Override
  public void practice() {
    System.out.println("El aseador esta limpiando!");
  }

  @Override
  protected void makeGratification() {
    super.setGratification(super.getSalary() * 10.0);
  }

  private String especialidad;

  public Aseador() {
  }

  public Aseador(String name, String lastName, Long salary) {
    super(name, lastName, salary);
  }

}
