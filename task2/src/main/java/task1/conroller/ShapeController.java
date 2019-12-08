package task1.conroller;

import task1.abstraction.Shape;
import java.util.Scanner;



public class ShapeController {

    private static Scanner in = new Scanner(System.in);

    public double countShapeArea(Shape[] shapes, String key) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getClass().getSimpleName().equals(key) ? shape.calcArea() : 0;
        }
        return sum;
    }

}
