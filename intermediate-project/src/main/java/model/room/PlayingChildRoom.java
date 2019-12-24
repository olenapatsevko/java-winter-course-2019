package model.room;

import model.abstraction.ChildRoom;
import model.enums.ChildAgeGroup;

import java.util.List;

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

    }

    //todo
    @Override
    public void removeToyFromRoom(T toy) {

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
