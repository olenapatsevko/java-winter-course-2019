package taskone.shapes;

import taskone.abstraction.Colors;
import taskone.abstraction.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;


    public Rectangle(Colors shapeColor, double length, double width) {
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
