public class Restar extends Operar{

    // Constructores: no devuelven un tipo de dato, pero sus parametros si.
    public Restar (double num1, double num2){
        super(num1, num2);
    }

    //metodo
    @Override
    public double Resultado (){
        return getNum1()-getNum2();
    }
}
