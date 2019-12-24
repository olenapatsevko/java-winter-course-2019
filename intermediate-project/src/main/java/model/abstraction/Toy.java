package model.abstraction;

import model.abstraction.base.Playable;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

abstract class Toy implements Playable {

    private Size size;
    private double price;
    private Model model;
    private ChildAgeGroup[] childAgeGroups;


}
