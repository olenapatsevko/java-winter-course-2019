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

    /**
     * it's a cover of a valueOf method with allows us to read a name of an enum this any case
     *
     * @param s name of the enum with any case
     * @return new enum
     */
    public static Size createSize(String s) {
        return Size.valueOf(s.toUpperCase());
    }
}
