package model.room;

import model.abstraction.ChildRoom;
import model.enums.ChildAgeGroup;

import java.util.List;

import static view.MainView.print;

public class PlayingChildRoom extends ChildRoom {
    private ChildAgeGroup[] childAgeGroups;
    private double budget;

    public PlayingChildRoom(List<ChildRoom.T> toys, ChildAgeGroup[] childAgeGroups, double budget) {
        super(toys);
        this.childAgeGroups = childAgeGroups;
        this.budget = budget;
    }

    public ChildAgeGroup[] getChildAgeGroups() {
        return childAgeGroups;
    }

    public void setChildAgeGroups(ChildAgeGroup[] childAgeGroups) {
        this.childAgeGroups = childAgeGroups;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    //todo
    @Override
    public void addToyToRoom(T toy) {
        List<T> toys = getToys();
        toys.add(toy);
        if ((this.budget - toy.getPrice()) < 0) {
            setBudget(getBudget() - toy.getPrice());
            setToys(toys);
            print(toy.toString() + " added");
        } else {
            print("Not enough money to add" + toy.toString());
        }

    }

    //todo
    @Override
    public void removeToyFromRoom(T toy) {
        List<T> toys = getToys();
        if (findToy(toy) >= 0) {
            toys.remove(findToy(toy));
            setBudget(getBudget() + toy.getPrice());
            print(toy.toString() + " has been removed");
        } else {
            print("Nothing to remove");
        }
    }

    //todo
    @Override
    public void removeAllToys(T toy) {

    }

    //todo
    public void increaseBudget(double price, int count) {

    }

    //todo
    public void increaseBudget(double price) {

    }

    //todo
    public void decreaseBudget(double price, int count) {

    }


    //todo
    public void decreaseBudget(double price) {

    }
}
