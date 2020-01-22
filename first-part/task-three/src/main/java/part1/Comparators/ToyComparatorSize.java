package part1.Comparators;

import part1.toys.toy.Toy;

import java.util.Comparator;

public class ToyComparatorSize implements Comparator<Toy> {



    @Override
    public int compare(Toy o1, Toy o2) {
        return o1.getSize()-o2.getSize();
    }
}
