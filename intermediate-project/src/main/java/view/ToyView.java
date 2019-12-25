package view;

import view.abstraction.View;

public class ToyView extends View {

    public double price() {
        print("Put the price");
        return scanNumber();
    }

    public String name() {
        print("Enter name");
        return scanString();
    }


}
