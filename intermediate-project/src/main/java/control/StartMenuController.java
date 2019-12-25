package control;

import control.abstraction.Controller;
import model.enums.ChildAgeGroup;
import view.StartMenuView;

import static model.enums.ChildAgeGroup.createChildAgeGroup;


public class StartMenuController extends Controller {

    private StartMenuView startMenuView = new StartMenuView();

    @Override
    public void start() {

        while (true) {
            startMenuView.menu();

            switch (startMenuView.scanInteger()) {
                case (1): {
                    startMenuView.print("Put the budget");
                    playingChildRoom.setBudget(startMenuView.scanNumber());
                    break;
                }
                case (2): {
                    try {
                        startMenuView.printAllEnums(ChildAgeGroup.values());
                        playingChildRoom.setChildAgeGroups(createChildAgeGroup(startMenuView.scanString()));
                    } catch (IllegalArgumentException | NullPointerException e) {
                        startMenuView.print("Illegal argument");
                        break;

                    }
                    break;
                }
                default: {
                    startMenuView.print("Illegal argument");
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
