package view;

import model.enums.ChildAgeGroup;
import model.enums.Size;
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


}
