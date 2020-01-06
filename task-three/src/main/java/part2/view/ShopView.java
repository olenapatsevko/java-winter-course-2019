package part2.view;

import java.util.Scanner;

public class ShopView {
    private static Scanner in = new Scanner(System.in);


    private static String[] menu = {"Print the shop", "Add department", "Add products", "Remove Department", "Sort departments", "Exit"};

    public static void print(String s) {
        System.out.println(s);
    }

    public static String scan() {
        return in.nextLine().trim();
    }

    public static void printMenu() {
        for (String s : menu) {
            print(s);
        }
    }


}
