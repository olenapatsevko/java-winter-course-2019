package part1.toys;

import part1.toys.toy.Toy;

public class BusToy  extends Toy {


    public BusToy(String name, double price, int size) {
        super(name, price, size);
    }

    public BusToy (){
       super("Bus" , 10.20 , 21);
    }
}
