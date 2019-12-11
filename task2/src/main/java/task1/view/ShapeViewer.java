package task1.view;


import task1.abstraction.Shape;

public class ShapeViewer {
    public static void view(Shape[] shapes){
        System.out.println("________________________________");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
        System.out.println("________________________________");
    }

    public static void  view(Shape shape){
        System.out.println(shape);
        System.out.println("________________________________");
    }

    public static void view (double square){
        System.out.println("Square is: "+ square);
    }

    public static void view(String s){
        System.out.println(s);
    }


}
