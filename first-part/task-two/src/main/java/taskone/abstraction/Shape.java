package taskone.abstraction;


import java.util.Comparator;

public abstract class Shape implements Drawable , Comparable<Shape> , Comparator<Shape> {

    private Colors shapeColor;

    public String draw() {
        return this.getClass().getSimpleName() + " is " + shapeColor;
    }

    public Shape(Colors shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    public double areaSum(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.calcArea();
        }
        return sum;
    }



    @Override
    public String toString() {
        return draw();
    }

    @Override
    public int compareTo(Shape o) {
        return this.shapeColor.compareTo(o.shapeColor);
    }

    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o1.calcArea()-o2.calcArea());
    }




}
