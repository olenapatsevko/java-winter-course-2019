package view;

import view.abstraction.View;

public class ToyView extends View {

    double price() {
        print("Put the price");
        return scanNumber();
    }


}
