package control.abstraction;

import model.room.PlayingChildRoom;

public abstract class Controller {


    protected static PlayingChildRoom playingChildRoom = new PlayingChildRoom();

    abstract public void start();


}
