package model.abstraction.base;

import model.abstraction.Toy;


public interface Room {

    void addToyToRoom(Toy toy);

    void removeToyFromRoom(Toy toy);

    void removeAllToys(Toy toy);

    int findToy(Toy toy);

    int findAndCountToy(Toy toy);




}
