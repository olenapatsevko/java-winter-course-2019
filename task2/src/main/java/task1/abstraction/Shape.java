package task1.abstraction;


public abstract class Shape implements Drawable {

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

    public Shape[] getShapeArray(int i ){
        return new Shape[i];
    }

    @Override
    public String toString() {
        return draw();
    }
}
