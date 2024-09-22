package org.example.domains;

public class Ejemplo extends Medico  {

  int numero1;  // Primitivo
  Integer numero2; // Objeto - No Primitivo - Rferencial

  boolean aBoolean1; // Primitivo
  Boolean aBoolean2; // Objeto - No Primitivo - Rferencial

  long aLong1; // Primitivo
  Long aLong2; // Objeto - No Primitivo - Rferencial

   short a = 1;
   Short b = 2;

   // Modificador - Tipo de dato de retorno - Nombre del metodo - Parametros
  // Cuerpo de la funcion

  // Nota -> Parse - Map - Casting = Transformación de datos
   private Integer  sumarDosNumeros(int numero1, String numero2) {
     return numero1 + Integer.parseInt(numero2);
   }
}
