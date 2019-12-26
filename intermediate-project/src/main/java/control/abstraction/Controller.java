package control.abstraction;

import model.room.PlayingChildRoom;

public abstract class Controller {


    /**
     * static object of a child room with is used to store and process the data
     */
    protected static PlayingChildRoom playingChildRoom = new PlayingChildRoom();

    abstract public void start();


}
