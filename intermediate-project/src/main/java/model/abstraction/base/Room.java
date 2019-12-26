package model.abstraction.base;

import model.abstraction.Toy;


/**
 * interface of a child room  that defines main method that every class should implement and override
 */
public interface Room {

    void addToyToRoom(Toy toy);

    void removeToyFromRoom(Toy toy);

    void removeAllToys(Toy toy);

    int findToy(Toy toy);

    int findAndCountToy(Toy toy);


}
