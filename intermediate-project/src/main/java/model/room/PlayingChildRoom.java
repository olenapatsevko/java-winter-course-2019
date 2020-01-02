package model.room;

import model.abstraction.ChildRoom;
import model.abstraction.Toy;
import model.enums.ChildAgeGroup;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static view.abstraction.View.print;

/**
 * class that represents the child room with toys for special category
 */
public class PlayingChildRoom extends ChildRoom {
    private Set<ChildAgeGroup> childAgeGroups = new LinkedHashSet<>();
    private double budget;


    public PlayingChildRoom(List<Toy> toys, Set<ChildAgeGroup> childAgeGroups, double budget) {
        super(toys);
        this.childAgeGroups = childAgeGroups;
        this.budget = budget;
    }

    public PlayingChildRoom() {
    }

    public Set<ChildAgeGroup> getChildAgeGroups() {
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

    /**
     * @param toy toy that we want to add to our room
     *            also in checked if it appropriate for budget and age category of a room
     */
    @Override
    public void addToyToRoom(Toy toy) {
        List<Toy> toys = getToys();

        if (this.budget >= toy.getPrice()) {
            if (childCategoryToy(toy)) {
                decreaseBudget(toy.getPrice());
                toys.add(toy);
                setToys(toys);
                print(toy.toString() + " added\n");
            } else {
                print("inappropriate category");
            }
        } else {
            print("Not enough money to add" + toy.toString());
        }

    }


    /**
     * @param toy remove the first toy that was found in the room similar to this
     */
    @Override
    public void removeToyFromRoom(Toy toy) {
        List<Toy> toys = getToys();
        if (findToy(toy) >= 0) {
            toys.remove(findToy(toy));
            increaseBudget(toy.getPrice());
            print(toy.toString() + " has been removed");
        } else {
            print("Nothing to remove");
        }
    }

    /**
     * @param toy type of you which copies we want to remove from room
     */
    @Override
    public void removeAllToys(Toy toy) {
        List<Toy> list = getToys();
        increaseBudget(toy.getPrice(), findAndCountToy(toy));
        for (int i = 0; i < findAndCountToy(toy); i++) {
            list.remove(toy);
        }
        this.setToys(list);


    }

    /**
     * @param toy type of toy that we want to find in our room
     * @return number of toys that we have found
     */
    @Override
    public int findAndCountToy(Toy toy) {
        int count = 0;
        for (Toy t : getToys()) {
            if (t.compare(toy)) {
                count++;
            }
        }
        return count;
    }


    /**
     * @param price price of a toy that we remove from our room
     * @param count number of similar toys that we want to remove
     */
    public void increaseBudget(double price, int count) {
        this.setBudget(this.getBudget() + (price * (double) count));
    }


    /**
     * @param price of a toy that we want to remove from our room
     */
    public void increaseBudget(double price) {
        this.setBudget(getBudget() + price);
    }

    /**
     * @param price price of a toy that we add to our room
     * @param count number of similar toys that we want to add
     */
    public void decreaseBudget(double price, int count) {
        setBudget(getBudget() - (price * (double) count));
    }

    /**
     * @param price price of a toy that we add to our room
     */
    public void decreaseBudget(double price) {
        setBudget(getBudget() - price);
    }

    @Override
    public String toString() {
        return "PlayingChildRoom:" +
                "childAgeGroups=" + childAgeGroups +
                ", budget=" + budget + super.toString();
    }


    /**
     * @param toy toy that we want to add
     * @return if category of this toy is appropriate for age category of the room return true
     */
    private boolean childCategoryToy(Toy toy) {
        for (ChildAgeGroup c : childAgeGroups) {
            if (toy.getChildAgeGroups().equals(c)) {
                return true;
            }
        }
        return false;
    }
}
