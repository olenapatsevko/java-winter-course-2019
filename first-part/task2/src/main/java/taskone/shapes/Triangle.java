package taskone.shapes;

import taskone.abstraction.Colors;
import taskone.abstraction.Shape;

public class Triangle extends Shape {


   private double base;
   private double height;


    public Triangle(Colors shapeColor, double base, double height) {
        super(shapeColor);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +
                "base=" + base +"\n"+
                "height=" + height +"\n";
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }
}
