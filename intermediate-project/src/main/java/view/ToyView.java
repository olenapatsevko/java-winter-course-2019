package view;

import view.abstraction.View;

/**
 * View for entering and presenting Toy data to user
 */
public class ToyView extends View {


    /**
     * @return double price of a toy
     */
    public double price() {
        print("Put the price");
        return scanNumber();
    }


    /**
     * @return string name for several Toys
     */
    public String name() {
        print("Enter name");
        return scanString();
    }


}
