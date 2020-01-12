package part2.model;

import java.util.ArrayList;
import java.util.List;

public class GeneratedList<T extends Number> extends GeneratedCollection {

    List<T> list = new ArrayList();

    public GeneratedList(T lowBoundary, T highBoundary) {
        super(lowBoundary, highBoundary);
    }


    public void generateList(T number) {
        if (number.doubleValue() < getHighBoundary().doubleValue() && number.doubleValue() > getLowBoundary().doubleValue()) {
            list.add(number);
        }
    }

    @Override
    public String toString() {
        return "GeneratedList{" +
                "list=" + list +
                '}';
    }
}
