package task1.abstraction;

public enum ShapeNames {
    CIRCLE ("Circle"),
    RECTANGLE("Rectangle"),
    TRIANGLE("Triangle");


    private String title;

    ShapeNames(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
