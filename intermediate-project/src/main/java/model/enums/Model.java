package model.enums;

public enum Model {
    DOLL, CAR, CUBE;

    /**
     * it's a cover of a valueOf method with allows us to read a name of an enum this any case
     *
     * @param s name of the enum with any case
     * @return new enum
     */
    public static Model createModel(String s) {

        return Model.valueOf(s.toUpperCase());


    }
}
