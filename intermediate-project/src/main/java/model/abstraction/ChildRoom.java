package model.abstraction;

import model.abstraction.base.Room;

import java.util.List;

public abstract class ChildRoom implements Room {
    private List<T> toys;

    public ChildRoom() {

    }

    public ChildRoom(List<T> toys) {
        this.toys = toys;
    }

    public List<T> getToys() {
        return toys;
    }

    public void setToys(List<T> toys) {
        this.toys = toys;
    }

    @Override
    public int findToy(T t) {
        for (int i = 0; i < this.toys.size(); i++) {
            Toy toy = this.toys.get(i);
            if (toy.getModel().equals(t.getModel()) && toy.getPrice() == t.getPrice() && toy.getSize().equals(t.getSize())) {
                return i;
            }
        }
        return -1;
    }


}
