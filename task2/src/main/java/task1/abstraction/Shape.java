package task1.abstraction;


import java.util.Comparator;

public abstract class Shape implements Drawable , Comparable<Shape> , Comparator<Shape> {

    private String shapeColor;

    public String draw() {
        return this.getClass().getSimpleName() + " is " + shapeColor;
    }

    public Shape(String shapeColor) {
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
        return this.shapeColor.charAt(0)-o.shapeColor.charAt(0);
    }

    @Override
    public int compare(Shape o1, Shape o2) {
        return (int) (o1.calcArea()-o2.calcArea());
    }




}
