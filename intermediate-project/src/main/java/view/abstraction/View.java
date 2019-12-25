package view.abstraction;

import java.util.Scanner;

public abstract class View {
    protected static Scanner in = new Scanner(System.in);

    public static void print(String s) {
        System.out.println(s);
    }

    public void printAllEnums(Enum[] enums) {
        for (Enum e : enums) {
            print(e.toString());
        }
    }


    public String scanString() {
        return in.nextLine().trim();

    }

    public int scanInteger() {
        try {
            return Integer.parseInt(scanString());
        } catch (ClassCastException e) {
            print("Enter correct integer data");
            return scanInteger();
        }
    }

    public double scanNumber() {
        try {
            return Double.parseDouble(scanString());
        } catch (ClassCastException e) {
            print("Enter correct double data");
            return scanNumber();
        }
    }


}
