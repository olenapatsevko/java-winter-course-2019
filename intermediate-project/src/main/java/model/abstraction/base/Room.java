package model.abstraction.base;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;

public interface Room {

    void addToyToRoom(T toy);

    void removeToyFromRoom(T toy);

    void removeAllToys(T toy);

    int findToy(T toy);

    int findAndCountToy(T toy);

    class T extends Toy {

        public T(Size size, double price, Model model, ChildAgeGroup[] childAgeGroups) {
            super(size, price, model, childAgeGroups);
        }
    }


}
