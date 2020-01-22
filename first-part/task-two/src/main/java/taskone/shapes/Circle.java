package taskone.shapes;

import taskone.abstraction.Colors;
import taskone.abstraction.Shape;

public class Circle extends Shape {
    private double radius;


    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius + "\n";
    }

    public Circle(Colors shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }


}
