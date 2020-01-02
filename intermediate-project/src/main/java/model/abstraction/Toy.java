package model.abstraction;

import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;


/**
 * abstract presentation of a toy which includes main features which we are able to do with any toy
 */
public abstract class Toy {

    private Size size;
    private double price;
    private Model model;
    private ChildAgeGroup childAgeGroups;

    public Toy() {
    }

    public Toy(Size size, double price, Model model, ChildAgeGroup childAgeGroups) {
        this.size = size;
        this.price = price;
        this.model = model;
        this.childAgeGroups = childAgeGroups;
    }

    public boolean compare(Toy t) {
        if (this.getSize().equals(t.getSize())
                && this.getModel().equals(t.getModel())
                && this.getPrice() == t.getPrice()
                && this.getChildAgeGroups().equals(t.getChildAgeGroups())) {
            return true;
        }
        return false;
    }

    public Toy(Model model) {
        this.model = model;
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

    public ChildAgeGroup getChildAgeGroups() {
        return childAgeGroups;
    }

    public void setChildAgeGroups(ChildAgeGroup childAgeGroups) {
        this.childAgeGroups = childAgeGroups;
    }

    @Override
    public String toString() {
        return
                "size=" + size +
                        ", price=" + price +
                        ", model=" + model +
                        ", childAgeGroups=" + (childAgeGroups);
    }
}
