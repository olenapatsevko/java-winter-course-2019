package task1;

import task1.shapes.Circle;
import task1.view.ShapeViewer;

public class Main {

    public static void main(String[] args) {
        ShapeViewer.view(Circle.class.getSimpleName());
    }
}
