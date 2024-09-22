import Abtract.Shape;
import domain.Circle;
import domain.Rectangule;
import domain.Square;

import javax.lang.model.SourceVersion;

public class Main {
    public static void main(String[] args) {
        Shape rectangule = new Rectangule(5.0, 5.0);
        Shape circle = new Circle(10);
        Rectangule square = new Square(3);

        System.out.println("El área del rectangulo es: " + rectangule.getArea());
        System.out.println("El perimetro del rectangulo es: " + rectangule.getArea());


        System.out.println("El área del cuadrado es  = "+square.getArea());
        System.out.println("El perimetro del cuadrado es  = "+square.getArea());
}
}
