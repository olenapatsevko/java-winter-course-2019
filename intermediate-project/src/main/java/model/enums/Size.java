package model.enums;

public enum Size {
    TINY("tiny"), SMALL("small"), MEDIUM("medium"), BIG("big");

    private String size;

    Size(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }
}
