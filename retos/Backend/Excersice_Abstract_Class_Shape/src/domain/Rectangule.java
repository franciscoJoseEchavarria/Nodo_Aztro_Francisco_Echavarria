package domain;

import Abtract.Shape;

public class Rectangule extends Shape {
    //atributos
    private double length;
    private double width;

    //Constructor
    public Rectangule (double length, double width){
        this.length= length;
        this.width = width;
    }



    // Metodo
    @Override
    public double getArea(double length, double width) {
        return length*width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getPerimetro() {
        return 2 * (length*width);
    }
}
