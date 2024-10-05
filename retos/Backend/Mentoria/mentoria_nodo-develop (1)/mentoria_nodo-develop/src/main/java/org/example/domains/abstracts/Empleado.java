package org.example.domains.abstracts;

/*
* Modificadores aplican a clases (interfaces, abstractas),
*   metodos, atributos, constructores
* */

// Modificador public
public abstract class Empleado {

  // Atributos
  private String name;
  private String lastName;
  private long salary;
  private double gratification;

  // Constructor

  public Empleado() {
  }

  public Empleado(String name, String lastName, Long salary) {
    this.name = name;
    this.lastName = lastName;
    this.salary = salary;
  }

  // Metodos
  public void setSalary(Long salary) {
    this.salary = salary;
    this.makeGratification();
  }

  public Long getSalary() {
    return salary;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  protected void setGratification(Double gratification) {
    this.gratification = gratification;
  }

  public Double getGratification() {
    return gratification;
  }

  public abstract void practice();

  public void practice(String name) {
    System.out.println("El empleado " + name + " esta trabajando!");
  }

  protected abstract void makeGratification();

}
