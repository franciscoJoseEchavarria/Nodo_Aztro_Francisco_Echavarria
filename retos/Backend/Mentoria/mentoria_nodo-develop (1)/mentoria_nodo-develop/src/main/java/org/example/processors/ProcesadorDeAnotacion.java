package org.example.processors;

import org.example.topics.events.UsoDeAnotador;
import org.example.topics.annotations.MiAnotacion;

import java.lang.reflect.Method;

  public class ProcesadorDeAnotacion {
    public static void main(String[] args) throws Exception {
      Method[] methods = UsoDeAnotador.class.getDeclaredMethods();
      for (Method method : methods) {
        if (method.isAnnotationPresent(MiAnotacion.class)) {
          MiAnotacion anotacion = method.getAnnotation(MiAnotacion.class);
          System.out.println("Método: " + method.getName() + ", Valor de la anotación: " + anotacion.valor());
        }
      }
    }
  }