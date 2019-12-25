package view.abstraction;

import java.util.Scanner;

public abstract class View {
    protected static Scanner in = new Scanner(System.in);

    public static void print(String s) {
        System.out.println(s);
    }


    static String scanString() {
        return in.nextLine().trim();

    }

}
