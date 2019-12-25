package model.enums;

public enum Model {
    DOLL, CAR, CUBE;

    public Model createModel(String s) {

        return Model.valueOf(s.toUpperCase());


    }
}
