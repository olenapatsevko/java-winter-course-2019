package task1.shapes;
import task1.abstraction.Shape;

public class Circle extends Shape {
  private   double radius;


    @Override
    public String toString() {
        return super.toString() +
                "radius=" + radius +"\n";
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}
