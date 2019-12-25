package control;

import control.abstraction.Controller;
import model.enums.Model;
import view.MainMenuView;


public class MainMenuController extends Controller {
    private MainMenuView mainMenuView = new MainMenuView();

    public void start() {

        while (true) {
            mainMenuView.menu();
            switch (mainMenuView.scanInteger()) {
                case (1): {
                    mainMenuView.print(playingChildRoom.toString());
                    break;
                }
                case (2): {
                    mainMenuView.print("Enter toy model");
                    try {
                        mainMenuView.printAllEnums(Model.values());
                        playingChildRoom.addToyToRoom(ToyFabric.createToy(mainMenuView.scanString()));

                    } catch (IllegalArgumentException | NullPointerException e) {
                        mainMenuView.print("Illegal argument");
                        break;
                    }


                }
                case (3): {
                    break;
                }
                case (4): {
                    break;
                }
                case (5): {
                    break;
                }
                case (6): {
                    break;
                }

                case (7): {
                    return;
                }

                default: {
                    break;
                }


            }


        }

    }


}
