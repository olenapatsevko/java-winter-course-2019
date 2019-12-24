package taskone.conroller;

import taskone.abstraction.Shape;
import taskone.shapes.Circle;
import taskone.shapes.Rectangle;
import taskone.shapes.Triangle;

import static java.util.Arrays.sort;
import static taskone.abstraction.Colors.*;
import static taskone.view.ShapeViewer.view;


public class ShapeController {


    public static void start() {
        Shape[] shapes = arrayinit();
        view("Our figures");
        view(shapes);

        view("Sorted with Comparator");
        sort(shapes, (o1, o2) -> (int) (o1.calcArea() - o2.calcArea()));
        view(shapes);

        view("Sorted with Comparable");
        sort(shapes);
        view(shapes);

    }

    private static Shape[] arrayinit() {
        return new Shape[]{new Circle(BLUE, 4),
                new Triangle(RED, 4, 3),
                new Rectangle(WHITE, 3, 5),
                new Circle(RED, 8),
                new Triangle(GREEN, 2, 1.5),
                new Triangle(BLUE, 4, 3),
                new Rectangle(ROSE, 3, 5),
                new Circle(BLACK, 8),
                new Triangle(BLUE, 2, 1.5),
                new Triangle(YELLOW, 4, 3),
                new Rectangle(ORANGE, 3, 90),
                new Circle(ORANGE, 8),
                new Triangle(WHITE, 2, 1.5),
                new Triangle(BLUE, 4, 36),
                new Rectangle(BLACK, 6, 5),
                new Circle(BLACK, 8),
                new Triangle(ROSE, 2, 1),
                new Triangle(RED, 4, 5),
                new Rectangle(YELLOW, 3, 5),
                new Circle(BLUE, 66),
                new Triangle(ROSE, 2, 1.5),
        };
    }
}
