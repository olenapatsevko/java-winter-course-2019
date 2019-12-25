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

                }

                default: {
                    break;
                }


            }


        }

    }


}
