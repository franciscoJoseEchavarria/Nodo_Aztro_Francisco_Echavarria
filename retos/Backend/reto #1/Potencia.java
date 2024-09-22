public class Potencia extends Operar {

    public Potencia (double num1, double num2){
        super (num1, num2);
    }

    @Override
    public double Resultado() {
        return Math.pow(getNum1(), getNum2());
    }
}
