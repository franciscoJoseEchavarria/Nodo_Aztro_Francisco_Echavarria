package org.example.topics.events;

import org.example.topics.annotations.MiAnotacion;

public class UsoDeAnotador {
    @MiAnotacion(valor = "Ejemplo de uso")
    public void miMetodo() {
      System.out.println("Método anotado");
    }
}
