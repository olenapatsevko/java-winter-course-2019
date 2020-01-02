package model.room;

import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;
import model.toys.Car;
import model.toys.Cube;
import model.toys.Doll;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomSortTest {


    public static PlayingChildRoom childRoom = new PlayingChildRoom() {{
        setBudget(1000000);
        setChildAgeGroups(ChildAgeGroup.ADOLESCENT);
        setChildAgeGroups(ChildAgeGroup.INFANT);
        setChildAgeGroups(ChildAgeGroup.TODDLER);
        setChildAgeGroups(ChildAgeGroup.PRESCHOOLER);
        setChildAgeGroups(ChildAgeGroup.SCHOOL_AGED);
        addToyToRoom(new Car(Size.SMALL, 23.0, Model.CAR, ChildAgeGroup.ADOLESCENT, "99"));
        addToyToRoom(new Car(Size.MEDIUM, 26.0, Model.CAR, ChildAgeGroup.INFANT, "1"));
        addToyToRoom(new Cube(Size.TINY, 223.340, Model.CUBE, ChildAgeGroup.SCHOOL_AGED, 9));
        addToyToRoom(new Car(Size.MEDIUM, 26.0, Model.CAR, ChildAgeGroup.ADOLESCENT, "1"));
        addToyToRoom(new Doll(Size.SMALL, 243.210, Model.DOLL, ChildAgeGroup.TODDLER, "4"));
        addToyToRoom(new Cube(Size.MEDIUM, 253.10, Model.CUBE, ChildAgeGroup.ADOLESCENT, 8));
        addToyToRoom(new Doll(Size.BIG, 293.60, Model.DOLL, ChildAgeGroup.PRESCHOOLER, "6"));
        addToyToRoom(new Car(Size.SMALL, 213.10, Model.CAR, ChildAgeGroup.TODDLER, "7"));
        addToyToRoom(new Cube(Size.MEDIUM, 223.10, Model.CUBE, ChildAgeGroup.PRESCHOOLER, 7));
        addToyToRoom(new Car(Size.TINY, 273.60, Model.CAR, ChildAgeGroup.INFANT, "9"));
        addToyToRoom(new Doll(Size.BIG, 223.08, Model.DOLL, ChildAgeGroup.ADOLESCENT, "10"));

    }};

    @Test
    public void sortByPrice() {
        RoomSort.sortByPrice(childRoom);

        assertEquals(childRoom.getToys().get(0).getPrice(), 23.0, 0);
    }

    @Test
    public void sortByModel() {
        RoomSort.sortByModel(childRoom);
        assertEquals(childRoom.getToys().get(0).getModel(), Model.DOLL);
    }

    @Test
    public void sortBySize() {
        RoomSort.sortBySize(childRoom);
        assertEquals(childRoom.getToys().get(0).getSize(), Size.TINY);
    }

    @Test
    public void sortByAgeGroup() {
        RoomSort.sortByAgeGroup(childRoom);
        assertEquals(childRoom.getToys().get(0).getChildAgeGroups(), ChildAgeGroup.INFANT);
    }
}