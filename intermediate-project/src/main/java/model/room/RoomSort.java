package model.room;

import model.abstraction.Toy;

import java.util.Comparator;

public class RoomSort {

    public static void sortByPrice(PlayingChildRoom playingChildRoom) {
        playingChildRoom.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });

    }

    public static void sortByModel(PlayingChildRoom playingChildRoom) {
        playingChildRoom.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getModel().compareTo(o2.getModel());
            }
        });
    }

    public static void sortBySize(PlayingChildRoom playingChildRoom) {
        playingChildRoom.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getSize().compareTo(o2.getSize());
            }
        });
    }

    public static void sortByAgeGroup(PlayingChildRoom playingChildRoom) {
        playingChildRoom.getToys().sort(new Comparator<Toy>() {
            @Override
            public int compare(Toy o1, Toy o2) {
                return o1.getChildAgeGroups().compareTo(o2.getChildAgeGroups());
            }
        });
    }
}
