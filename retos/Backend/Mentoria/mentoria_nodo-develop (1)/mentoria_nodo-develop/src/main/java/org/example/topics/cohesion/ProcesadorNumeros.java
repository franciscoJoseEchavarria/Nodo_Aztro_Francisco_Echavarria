package org.example.topics.cohesion;


import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class ProcesadorNumeros {

  /*
  * Problema
        TODO Dame un codigo que lea una lista de numeros de un json y para cada una de las siguientes operaciones genere un nuevo archivo txt:
        TODO Mantenga su numero original y obtenga su raiz cuadrada
        TODO Mantenga su numero original y obtenga su potencia
        TODO  Sume todos los valores existentes
*
  * */

  private final LeerArchivo leerArchivo;

  public ProcesadorNumeros() {
    this.leerArchivo = new LeerArchivo();
  }

  @SneakyThrows
  public void execute() {

    List<Double> numeros = leerArchivo.getList("numeros.json");

    // Crear archivos de salida
    FileWriter raizCuadradaWriter = new FileWriter("2_raiz_cuadrada.txt");
    FileWriter potenciaWriter = new FileWriter("2_potencia.txt");
    FileWriter sumaWriter = new FileWriter("2_suma.txt");

    double suma = 0;

    // Procesar cada número
    for (Double numero : numeros) {
      double raizCuadrada = Math.sqrt(numero);
      double potencia = Math.pow(numero, 2);

      // Escribir en archivos
      raizCuadradaWriter.write("Número: " + numero + ", Raíz Cuadrada: " + raizCuadrada + "\n");
      potenciaWriter.write("Número: " + numero + ", Potencia: " + potencia + "\n");

      suma += numero;
    }

    // Escribir la suma total
    sumaWriter.write("Suma de todos los valores: " + suma + "\n");

    // Cerrar los escritores
    raizCuadradaWriter.close();
    potenciaWriter.close();
    sumaWriter.close();
  }


  @SneakyThrows
  public static void main(String[] args) {

    ProcesadorNumeros procesadorNumeros
        = new ProcesadorNumeros();

    procesadorNumeros.execute();
  }
}
