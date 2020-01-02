package control;

import control.abstraction.Controller;
import control.fabric.ToyFabric;
import model.enums.Model;
import view.MainMenuView;

import static model.room.RoomSort.*;


public class MainMenuController extends Controller {
    private MainMenuView mainMenuView = new MainMenuView();
    private InnerSort innerSort = new InnerSort();
    private ToyController toyController = new ToyController();

    /**
     * this method let to coordinate actions between view and model
     */
    public void start() {

        while (true) {
            mainMenuView.menu();
            switch (mainMenuView.scanInteger()) {
                case (1): {
                    printRoom();
                    break;
                }
                case (2): {
                    mainMenuView.print("Enter toy model");
                    mainMenuView.printAllEnums(Model.values());
                    playingChildRoom.addToyToRoom(ToyFabric.createToy(mainMenuView.enterModel()));
                    printRoom();
                    break;
                }
                case (3): {
                    mainMenuView.print("Enter toy model");
                    mainMenuView.printAllEnums(Model.values());
                    playingChildRoom.removeAllToys(ToyFabric.createToy(mainMenuView.enterModel()));
                    printRoom();
                    break;
                }
                case (4): {
                    mainMenuView.print("Enter sort parameter");
                    innerSort.sort(mainMenuView.scanString());

                    break;
                }
                case (5): {
                    toyController.start();
                    break;
                }
                case (6): {
                    playingChildRoom.setChildAgeGroups(mainMenuView.enterChildAgeGroup());
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

    public InnerSort getInnerSort() {
        return this.innerSort;
    }

    /**
     * Inner class for sorting lists with toys
     */
    private class InnerSort {

        /**
         * @param s- name of the parameter with
         */
        void sort(String s) {
            switch (s.toLowerCase()) {
                case ("price"): {
                    sortByPrice(playingChildRoom);
                    printRoom();
                    break;
                }
                case ("model"): {
                    sortByModel(playingChildRoom);
                    printRoom();
                    break;
                }
                case ("size"): {
                    sortBySize(playingChildRoom);
                    printRoom();
                    break;

                }
                case ("age group"): {
                    sortByAgeGroup(playingChildRoom);
                    printRoom();
                    break;

                }
                default: {
                    mainMenuView.print("Wrong value");
                    break;
                }
            }
        }


    }


    private void printRoom() {
        mainMenuView.print("\n" + playingChildRoom.toString() + "\n");
    }
}
