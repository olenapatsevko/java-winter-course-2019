package model.abstraction;

import model.abstraction.base.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * abstract child room that encapsulate the list of toys which are in the room
 */
public abstract class ChildRoom implements Room {
    private List<Toy> toys = new ArrayList<>();

    public ChildRoom() {
    }

    public ChildRoom(List<Toy> toys) {
        this.toys = toys;
    }

    public List<Toy> getToys() {
        return toys;
    }

    public void setToys(List<Toy> toys) {
        this.toys = toys;
    }

    /**
     * @param toy that we should find
     * @return position in the toy list or negative number(-1) if there are no such toy in the list
     */
    @Override
    public int findToy(Toy toy) {
        for (int i = 0; i < this.toys.size(); i++) {
            Toy toy1 = this.toys.get(i);
            if (toy1.getModel().equals(toy1.getModel()) && toy.getPrice() == toy1.getPrice() && toy.getSize().equals(toy.getSize())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return ", toys=" + toys;
    }
}
