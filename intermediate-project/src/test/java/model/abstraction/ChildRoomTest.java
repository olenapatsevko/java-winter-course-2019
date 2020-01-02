package model.abstraction;


import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;
import model.room.PlayingChildRoom;
import model.toys.Car;
import model.toys.Cube;
import model.toys.Doll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChildRoomTest {


    public static ChildRoom childRoom = new PlayingChildRoom() {{
        setBudget(1000000);
        setChildAgeGroups(ChildAgeGroup.ADOLESCENT);
        addToyToRoom(new Doll(Size.SMALL, 23.0, Model.DOLL, ChildAgeGroup.ADOLESCENT, "99"));
        addToyToRoom(new Car(Size.MEDIUM, 26.3, Model.CAR, ChildAgeGroup.ADOLESCENT, "1"));
        addToyToRoom(new Cube(Size.TINY, 223.340, Model.CUBE, ChildAgeGroup.ADOLESCENT, 9));
        addToyToRoom(new Car(Size.MEDIUM, 2123.0234, Model.CAR, ChildAgeGroup.ADOLESCENT, "3"));
        addToyToRoom(new Doll(Size.SMALL, 243.210, Model.DOLL, ChildAgeGroup.ADOLESCENT, "4"));
        addToyToRoom(new Cube(Size.MEDIUM, 253.10, Model.CUBE, ChildAgeGroup.ADOLESCENT, 8));
        addToyToRoom(new Doll(Size.BIG, 293.60, Model.DOLL, ChildAgeGroup.ADOLESCENT, "6"));
        addToyToRoom(new Car(Size.SMALL, 213.10, Model.CAR, ChildAgeGroup.ADOLESCENT, "7"));
        addToyToRoom(new Cube(Size.MEDIUM, 223.10, Model.CUBE, ChildAgeGroup.ADOLESCENT, 7));
        addToyToRoom(new Car(Size.TINY, 273.60, Model.CAR, ChildAgeGroup.ADOLESCENT, "9"));
        addToyToRoom(new Doll(Size.BIG, 223.08, Model.DOLL, ChildAgeGroup.ADOLESCENT, "10"));
        addToyToRoom(new Cube(Size.MEDIUM, 233.40, Model.CUBE, ChildAgeGroup.ADOLESCENT, 12));
        addToyToRoom(new Doll(Size.SMALL, 782.320, Model.DOLL, ChildAgeGroup.ADOLESCENT, "12"));
        addToyToRoom(new Car(Size.TINY, 13.10, Model.CAR, ChildAgeGroup.ADOLESCENT, "13"));
        addToyToRoom(new Cube(Size.MEDIUM, 53.40, Model.CUBE, ChildAgeGroup.ADOLESCENT, 6));
        addToyToRoom(new Car(Size.SMALL, 253.20, Model.CAR, ChildAgeGroup.ADOLESCENT, "16"));
        addToyToRoom(new Doll(Size.TINY, 123.20, Model.DOLL, ChildAgeGroup.ADOLESCENT, "18"));
        addToyToRoom(new Cube(Size.MEDIUM, 823.90, Model.CUBE, ChildAgeGroup.ADOLESCENT, 4));
        addToyToRoom(new Doll(Size.TINY, 2323.10, Model.DOLL, ChildAgeGroup.ADOLESCENT, "456"));
        addToyToRoom(new Car(Size.BIG, 283.10, Model.CAR, ChildAgeGroup.ADOLESCENT, "6346"));
        addToyToRoom(new Cube(Size.SMALL, 823.20, Model.CUBE, ChildAgeGroup.ADOLESCENT, 2));
        addToyToRoom(new Car(Size.BIG, 823.10, Model.CAR, ChildAgeGroup.ADOLESCENT, "357"));
    }};


    @Before
    @Test
    public void findToy() {
        assertEquals(childRoom.findToy(new Doll(Size.SMALL, 23.0, Model.DOLL, ChildAgeGroup.ADOLESCENT, "99")), 0);
        assertEquals(childRoom.findToy(new Car(Size.MEDIUM, 2123.0234, Model.CAR, ChildAgeGroup.ADOLESCENT, "3")), 3);
    }

}