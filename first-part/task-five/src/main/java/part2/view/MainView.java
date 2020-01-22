package part2.view;

import java.util.Scanner;

public class MainView {

    static Scanner in = new Scanner(System.in);


    public static void print(String s) {
        System.out.println(s);
    }

    public static String scan(String s) {
        print(s);
        return in.nextLine();
    }


}
