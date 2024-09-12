public class Multiplicar  extends Operar{

    // Constructores: no devuelven un tipo de dato, pero sus parametros si.
    public Multiplicar (double num1, double num2){
        super (num1, num2);
    }

    @Override
    public double Resultado (){
        return getNum1()*getNum2();
    }

}
