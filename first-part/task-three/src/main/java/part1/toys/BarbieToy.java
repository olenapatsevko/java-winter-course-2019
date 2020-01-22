package part1.toys;

import part1.toys.toy.Toy;

public class BarbieToy extends Toy {


    public BarbieToy(String name, double price, int size) {
        super(name, price, size);
    }


    public BarbieToy() {
        super("Barbie", 19.99, 12);

    }
}
