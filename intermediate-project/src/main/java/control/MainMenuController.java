package control;

import control.abstraction.Controller;
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
                    break;
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
