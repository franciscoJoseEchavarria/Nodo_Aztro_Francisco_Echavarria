import java.io.IOException;

public class Dividir extends Operar {


    public Dividir(double num1, double num2) {
        super(num1, num2);
    }


    @Override
    public double Resultado() {
        if (getNum2() == 0) {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
        return getNum2() / getNum2();
    }
}


