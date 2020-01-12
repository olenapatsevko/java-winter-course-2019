package part2.model;


import java.util.concurrent.ThreadLocalRandom;

public class GeneratedCollection<T extends Number> {
    T lowBoundary;
    T highBoundary;
    int size;

    public GeneratedCollection(T lowBoundary, T highBoundary) {
        this.setHighBoundary(highBoundary);
        this.setLowBoundary(lowBoundary);
    }

    public Number generate() {
        return ThreadLocalRandom.current().nextDouble(lowBoundary.doubleValue(), highBoundary.doubleValue());
    }

    public T getLowBoundary() {
        return lowBoundary;
    }

    public void setLowBoundary(T lowBoundary) {
        this.lowBoundary = lowBoundary;
    }

    public T getHighBoundary() {
        return highBoundary;
    }

    public void setHighBoundary(T highBoundary) {
        this.highBoundary = highBoundary;
    }


}
