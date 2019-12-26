package view.abstraction;

import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

import java.util.Scanner;

/**
 * class with present data to user and read entered data
 */
public abstract class View {
    protected static Scanner in = new Scanner(System.in);


    /**
     * @param m String array with menu items
     */
    public void menu(String[] m) {
        for (int i = 0; i < m.length; i++) {
            print(i + 1 + " - " + m[i]);
        }
    }


    public static void print(String s) {
        System.out.println(s);
    }


    /**
     * @param enums array of enums to present
     */
    public void printAllEnums(Enum[] enums) {
        for (Enum e : enums) {
            print(e.toString());
        }
    }


    /**
     * @return read entered string
     */
    public String scanString() {
        return in.nextLine().trim();

    }

    /**
     * checks entered data for correctness
     *
     * @return entered integer
     */
    public int scanInteger() {
        try {
            return Integer.parseInt(scanString());
        } catch (Exception e) {
            print("Enter correct integer data");
            return scanInteger();
        }
    }

    /**
     * checks entered data for correctness
     *
     * @return entered double
     */
    public double scanNumber() {
        try {
            return Double.parseDouble(scanString());
        } catch (Exception e) {
            print("Enter correct double data");
            return scanNumber();
        }
    }


    /**
     * checks entered data for correctness
     *
     * @return entered enum ChildAgeGroup
     */
    public ChildAgeGroup enterChildAgeGroup() {
        for (; ; ) {
            print("Enter child age group");
            this.printAllEnums(ChildAgeGroup.values());
            try {
                return ChildAgeGroup.createChildAgeGroup(scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                print("Illegal argument");
            }
        }
    }

    /**
     * checks entered data for correctness
     *
     * @return entered enum Size
     */
    public Size enterSize() {
        for (; ; ) {
            print("Enter size");
            this.printAllEnums(Size.values());
            try {
                return Size.createSize(scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                print("Illegal argument");

            }
        }
    }

    /**
     * checks entered data for correctness
     *
     * @return entered enum Model
     */
    public Model enterModel() {
        for (; ; ) {
            print("Enter model");
            this.printAllEnums(Size.values());
            try {
                return Model.createModel(scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                print("Illegal argument");

            }
        }
    }

}
