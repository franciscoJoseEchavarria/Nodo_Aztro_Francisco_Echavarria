public class Sumar extends Operar {
    public Sumar(double num1, double num2) {
        super(num1, num2);
    }
    //metodo
    @Override
    public double Resultado (){
        return getNum1()+getNum2();

    }



}
