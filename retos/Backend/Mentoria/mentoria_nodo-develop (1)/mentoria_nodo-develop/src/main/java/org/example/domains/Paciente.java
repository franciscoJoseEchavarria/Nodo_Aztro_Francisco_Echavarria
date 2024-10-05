package org.example.domains;

import org.example.domains.abstracts.Empleado;

import java.util.Map;

public class Paciente extends Empleado {

  // Mapa de relacion de especialidad y su historia.
  private Map<String, String> history;

  public Paciente() {
  }

  public Paciente(String name, String lastName, Long salary, Map<String, String> history) {
    super(name, lastName, salary);
    this.history = history;
  }

  @Override
  public void practice() {
    System.out.println("El paciente esta en consulta!");
  }


  @Override
  protected void makeGratification() {
    setGratification(getSalary() * 0.0);
  }

  public Map<String, String> getHistory() {
    return history;
  }

  public void setHistory(Map<String, String> history) {
    this.history = history;
  }
}
