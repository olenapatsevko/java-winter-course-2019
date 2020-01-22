package part2.view;

import part2.model.Product;
import part2.model.Shop;

import java.util.Scanner;

public class ShopView {
    private static Scanner in = new Scanner(System.in);


    private static String[] menu = {"1 Print the shop", "2 Add department", "3 Add products", "4 Remove Department", "5 Sort departments", "6 Exit"};

    public static void print(String s) {
        System.out.println(s);
    }

    public static String scan() {
        return in.nextLine().trim();
    }

    public static String scan(String s) {
        print(s);
        return scan();
    }

    public static void printMenu() {
        for (String s : menu) {
            print(s);
        }
    }

    public static Product createProduct() {
        return new Product(scan("Enter product name "), Double.parseDouble(scan("Enter product price ")), scan("Enter product description "));
    }

    public static Shop.Department createDepartment() {
        return new Shop.Department(scan("Put name of the department "), scan("Put the location "), scan("Put the service"), createProduct());
    }


}
