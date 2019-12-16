package part1.toys;

import part1.toys.toy.Toy;

public class CarToy extends Toy {

    public CarToy(String name, double price, int size) {
        super(name, price, size);
    }

    public CarToy() {
        super("Car", 2.10, 10);
    }
}
