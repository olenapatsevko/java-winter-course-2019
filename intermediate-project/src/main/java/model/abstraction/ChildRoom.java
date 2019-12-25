package model.abstraction;

import model.abstraction.base.Room;

import java.util.ArrayList;
import java.util.List;

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
