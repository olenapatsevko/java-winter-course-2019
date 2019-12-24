package model.abstraction;

import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

public abstract class Toy {

    private Size size;
    private double price;
    private Model model;
    private ChildAgeGroup[] childAgeGroups;


    public Toy(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups) {
        this.size = size;
        this.price = price;
        this.model = model;
        this.childAgeGroups = childAgeGroups;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public ChildAgeGroup[] getChildAgeGroups() {
        return childAgeGroups;
    }

    public void setChildAgeGroups(ChildAgeGroup[] childAgeGroups) {
        this.childAgeGroups = childAgeGroups;
    }


}
