import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            try {
                // Solicitar el primer número
                System.out.println("Introduce el primer número: ");
                double num1 = scanner.nextDouble();

                // Solicitar el segundo número
                System.out.println("Introduce el segundo número: ");
                double num2 = scanner.nextDouble();

                // Solicitar la operación
                System.out.println("Elige una operación (1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir, 5: Potencia): ");
                int opcion = scanner.nextInt();

                Operar operacion = null;

                // Lógica del switch
                switch (opcion) {
                    case 1:
                        operacion = new Sumar(num1, num2);
                        break;
                    case 2:
                        operacion = new Restar(num1, num2);
                        break;
                    case 3:
                        operacion = new Multiplicar(num1, num2);
                        break;
                    case 4:
                        operacion = new Dividir(num1, num2);
                        break;
                    case 5:
                        operacion = new Potencia(num1, num2);
                        break;
                    default:
                        System.out.println("Opción no válida");
                        continue;
                }

                // Si se selecciona una operación válida, mostrar el resultado
                if (operacion != null) {
                    System.out.println("El resultado es: " + operacion.Resultado());
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Por favor, introduce números válidos.");
                scanner.nextLine(); // Limpiar la entrada errónea
                continue;
            } catch (NoSuchElementException e) {
                System.out.println("Error: Elemento no encontrado en la entrada.");
                continue;
            } catch (ArithmeticException e) {
                System.out.println("Error aritmético: " + e.getMessage());
                continue;
            }

            scanner.close();
        }
    }
}

