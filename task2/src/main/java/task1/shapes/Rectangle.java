package task1.shapes;

import task1.abstraction.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;


    public Rectangle(String shapeColor, double length, double width) {
        super(shapeColor);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return super.toString() +
                " length=" + length +"\n"+
                " width=" + width+"\n";
    }

    @Override
    public double calcArea() {
        return length * width;
    }
}
