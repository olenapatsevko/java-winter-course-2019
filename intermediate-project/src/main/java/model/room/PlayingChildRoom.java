package model.room;

import model.abstraction.ChildRoom;
import model.enums.ChildAgeGroup;

import java.util.ArrayList;
import java.util.List;

import static view.abstraction.View.print;

public class PlayingChildRoom extends ChildRoom {
    private List<ChildAgeGroup> childAgeGroups = new ArrayList<>();
    private double budget;

    public PlayingChildRoom(List<ChildRoom.T> toys, List<ChildAgeGroup> childAgeGroups, double budget) {
        super(toys);
        this.childAgeGroups = childAgeGroups;
        this.budget = budget;
    }

    public PlayingChildRoom() {
    }

    public List<ChildAgeGroup> getChildAgeGroups() {
        return childAgeGroups;
    }

    public void setChildAgeGroups(ChildAgeGroup childAgeGroups) {
        this.childAgeGroups.add(childAgeGroups);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public void addToyToRoom(T toy) {
        List<T> toys = getToys();
        toys.add(toy);
        if ((this.budget - toy.getPrice()) < 0) {
            decreaseBudget(toy.getPrice());
            setToys(toys);
            print(toy.toString() + " added");
        } else {
            print("Not enough money to add" + toy.toString());
        }

    }


    @Override
    public void removeToyFromRoom(T toy) {
        List<T> toys = getToys();
        if (findToy(toy) >= 0) {
            toys.remove(findToy(toy));
            increaseBudget(toy.getPrice());
            print(toy.toString() + " has been removed");
        } else {
            print("Nothing to remove");
        }
    }

    @Override
    public void removeAllToys(T toy) {
        List<T> list = getToys();
        for (int i = 0; i < findAndCountToy(toy); i++) {
            list.remove(toy);
        }
        increaseBudget(toy.getPrice(), findAndCountToy(toy));
        setToys(list);
    }

    @Override
    public int findAndCountToy(T toy) {
        List<T> toys = getToys();
        int count = 0;
        for (T t : toys) {
            if (t.equals(toy)) {
                ++count;
            }
        }
        return count;
    }

    public void increaseBudget(double price, int count) {
        setBudget(getBudget() + (price * (double) count));
    }

    public void increaseBudget(double price) {
        setBudget(getBudget() + price);
    }


    public void decreaseBudget(double price, int count) {
        setBudget(getBudget() - (price * (double) count));
    }


    public void decreaseBudget(double price) {
        setBudget(getBudget() - price);
    }
}
