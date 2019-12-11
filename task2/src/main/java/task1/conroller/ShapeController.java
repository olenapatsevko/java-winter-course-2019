package task1.conroller;

import task1.abstraction.Shape;
import task1.shapes.Circle;
import task1.shapes.Rectangle;
import task1.shapes.Triangle;
import task1.view.ShapeViewer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import static java.util.Arrays.*;
import static java.util.Arrays.sort;
import static task1.view.ShapeViewer.*;


public class ShapeController {



    public double countShapeArea(Shape[] shapes, String key) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.getClass().getSimpleName().equals(key) ? shape.calcArea() : 0;
        }
        return sum;
    }

    public  static void start() {
       Shape []shapes = {new Circle("Blue", 4),
               new Triangle("Red",4,3),
               new Rectangle("Rose", 3,5),
               new Circle("Purple", 8),
               new Triangle("Red",2,1.5),
               new Triangle("Red",4,3),
               new Rectangle("Rose", 3,5),
               new Circle("Purple", 8),
               new Triangle("Green",2,1.5),
               new Triangle("Red",4,3),
               new Rectangle("Violet", 3,90),
               new Circle("Purple", 8),
               new Triangle("Red",2,1.5),
               new Triangle("White",4,36),
               new Rectangle("Rose", 6,5),
               new Circle("Purple", 8),
               new Triangle("Black",2,1),
               new Triangle("Red",4,5),
               new Rectangle("Green", 3,5),
               new Circle("Purple", 66),
               new Triangle("Black",2,1.5),
              };
       view("Our figures");
       view(shapes);

       view("Sorted with Comparator");
       sort(shapes, (o1, o2) -> (int) (o1.calcArea()-o2.calcArea()));
       view(shapes);

       view("Sorted with Comparator");
       sort(shapes);
       view(shapes);

    }
}
