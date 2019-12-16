package part1.Comparators;

import part1.Toy;

import java.util.Comparator;


public class ToyComparatorPrice implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }


}
