package org.example.topics.generics;

public class MainGenerics {
  public static void main(String[] args) {
    Caja<String> cajaDeString = new Caja<>();
    cajaDeString.poner("Hola");
    System.out.println(cajaDeString.sacar());

    Caja<Integer> cajaDeInteger = new Caja<>();
    cajaDeInteger.poner(123);
    System.out.println(cajaDeInteger.sacar());
  }
}