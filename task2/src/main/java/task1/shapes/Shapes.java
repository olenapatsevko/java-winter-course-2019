package task1.shapes;

import task1.abstraction.Shape;


public class Shapes <T extends Shape> {

    public double countShapeArea(T[] shapes, String key) {
        double sum = 0;
        for (T shape : shapes) {
            sum += shape.getClass().getSimpleName().equals(key) ? shape.calcArea() : 0;
        }
        return sum;
    }



}
