package model.toys;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

public class Cube extends Toy {
    private int numberOfSides = 3;

    public Cube() {

    }

    public Cube(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups) {
        super(size, price, model, childAgeGroups);
    }

    public Cube(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups, int numberOfSides) {
        super(size, price, model, childAgeGroups);
        this.numberOfSides = numberOfSides;
    }


    public int getNumberOfSides() {
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfSides=" + numberOfSides;
    }
}
