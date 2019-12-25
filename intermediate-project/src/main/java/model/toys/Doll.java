package model.toys;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

public class Doll extends Toy {
    private String name = "Barbie";

    public Doll(Size size, double price, ChildAgeGroup[] childAgeGroups) {
        super(size, price, Model.DOLL, childAgeGroups);
    }

    public Doll(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups, String name) {
        super(size, price, model, childAgeGroups);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return
                "Name=" + name + " " + super.toString();
    }
}
