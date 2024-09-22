package domain;

import Abtract.Shape;

public class Circle extends Shape {
    private double radio ;

    //Constructor
    public Circle (double radio){
        this.radio = radio;
    }

    //Metodos
    @Override
    public double getArea() {
        return radio* Math.PI *radio;
    }

    @Override
    public double getArea(double length, double width) {
        return radio* Math.PI *radio;
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }
}
