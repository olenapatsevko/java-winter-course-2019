package model.toys;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;


/**
 * Toy expanse with personal params  and overloaded @method toString()
 */
public class Car extends Toy {
    private String name = "Bugatti";


    public Car(Model model) {
        super(model);
    }

    public Car(Size size, double price, Model model, ChildAgeGroup childAgeGroups, String name) {
        super(size, price, model, childAgeGroups);
        this.name = name;

    }


    public Car(Size size, double price, Model model, ChildAgeGroup childAgeGroups) {
        super(size, price, model, childAgeGroups);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Name='" + name + super.toString();
    }
}
