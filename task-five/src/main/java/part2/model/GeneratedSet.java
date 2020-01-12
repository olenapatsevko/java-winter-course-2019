package part2.model;

import java.util.HashSet;
import java.util.Set;

public class GeneratedSet<T extends Number> extends GeneratedCollection {

    Set<T> set = new HashSet<>();

    public GeneratedSet(T lowBoundary, T highBoundary) {
        super(lowBoundary, highBoundary);
    }

    public void generateSet(T number) {
        if (number.doubleValue() < getHighBoundary().doubleValue() && number.doubleValue() > getLowBoundary().doubleValue()) {
            set.add(number);
        }
    }

    @Override
    public String toString() {
        return "GeneratedSet{" +
                "set=" + set +
                '}';
    }
}
