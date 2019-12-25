package model.toys;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

public class Car extends Toy {
    private String name = "Bugatti";
    private boolean automated = false;

    public Car(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups, String name, boolean automated) {
        super(size, price, model, childAgeGroups);
        this.name = name;
        this.automated = automated;
    }


    public Car(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups) {
        super(size, price, model, childAgeGroups);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAutomated() {
        return automated;
    }

    public void setAutomated(boolean automated) {
        this.automated = automated;
    }

    @Override
    public String toString() {
        return "Name='" + name +
                ", automated=" + automated + super.toString();
    }
}
