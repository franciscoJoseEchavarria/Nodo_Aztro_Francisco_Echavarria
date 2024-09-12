public class Dividir extends Operar {


    public Dividir (double num1 , double num2) {
        super( num1, num2);
    }

    @Override
    public double Resultado() {
        return getNum1() / getNum2();
    }
}
