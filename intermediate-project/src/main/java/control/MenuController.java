package control;

import control.abstraction.Controller;
import model.enums.ChildAgeGroup;
import view.MenuView;

import static model.enums.ChildAgeGroup.createChildAgeGroup;


public class MenuController extends Controller {

    MenuView menuView = new MenuView();

    @Override
    public void start() {

        while (true) {
            menuView.menu(menuView.getStartMenu());
            
            switch (menuView.scanInteger()) {
                case (1): {
                    menuView.print("Put the budget");
                    playingChildRoom.setBudget(menuView.scanNumber());
                    break;
                }
                case (2): {
                    try {
                        menuView.printAllEnums(ChildAgeGroup.values());
                        playingChildRoom.setChildAgeGroups(createChildAgeGroup(menuView.scanString()));
                    } catch (IllegalArgumentException | NullPointerException e) {
                        menuView.print("Illegal argument");
                        break;

                    }
                    break;
                }
                default: {
                    menuView.print("Illegal argument");
                    break;

                }
            }

            if (checkNecessaryConditions()) {
                break;
            } else {
                continue;
            }

        }


    }

    private boolean checkNecessaryConditions() {
        if (playingChildRoom.getBudget() > 0.0 && !playingChildRoom.getChildAgeGroups().isEmpty()) {
            return true;
        }
        return false;
    }

}
