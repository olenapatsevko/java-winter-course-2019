package part1.Comparators;

import part1.Toy;

import java.util.Comparator;

public class ToyComparatorName implements Comparator<Toy> {
    @Override
    public int compare(Toy o1, Toy o2) {
        for (int i = 0; i < o1.getName().length(); i++) {
            if (o1.getName().charAt(i) - o2.getName().charAt(i) == 0) {
                continue;
            } else {
                return o1.getName().charAt(i) - o2.getName().charAt(i);
            }
        }
        return o1.getName().charAt(0) - o2.getName().charAt(0);

    }
}
