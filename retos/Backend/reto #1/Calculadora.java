import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args) {



        // Declaración de objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Introduce el primer numero " );

        double num1 = scanner.nextDouble();

        System.out.println(" Introduce el segundo número " );

        double num2 = scanner.nextDouble();

        System.out.println("Elige una operación (1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir):" );

        int opcion = scanner.nextInt();


        // Objeto

        Operar operacion = null;

        switch ( opcion) {
            case 1:
                operacion = new Sumar ( num1, num2);
                break;
            case 2:
                operacion = new Restar(num1, num2);
                break;
            case 3:
                operacion = new Multiplicar(num1, num2);
                break;
            case 4:
                operacion = new Dividir (num1, num2);
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        if (operacion != null) {
            System.out.println("El resultado es: " + operacion.Resultado());
        }

        scanner.close();
    }

}


