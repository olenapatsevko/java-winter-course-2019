package control;

import control.abstraction.Controller;
import control.fabric.ToyFabric;
import model.abstraction.Toy;
import model.enums.Model;
import view.MainMenuView;

import java.util.Comparator;


public class MainMenuController extends Controller {
    private MainMenuView mainMenuView = new MainMenuView();
    private InnerSort innerSort = new InnerSort();
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

    private class InnerSort {
        void sort(String s) {
            switch (s.toLowerCase()) {
                case ("price"): {
                    playingChildRoom.getToys().sort(new Comparator<Toy>() {
                        @Override
                        public int compare(Toy o1, Toy o2) {
                            return (int) (o1.getPrice() - o2.getPrice());
                        }
                    });
                    printRoom();
                    break;
                }
                case ("model"): {
                    playingChildRoom.getToys().sort(new Comparator<Toy>() {
                        @Override
                        public int compare(Toy o1, Toy o2) {
                            return o1.getModel().compareTo(o2.getModel());
                        }
                    });
                    printRoom();
                    break;
                }
                case ("size"): {
                    playingChildRoom.getToys().sort(new Comparator<Toy>() {
                        @Override
                        public int compare(Toy o1, Toy o2) {
                            return o1.getSize().compareTo(o2.getSize());
                        }
                    });
                    printRoom();
                    break;

                }
                case ("age group"): {
                    playingChildRoom.getToys().sort(new Comparator<Toy>() {
                        @Override
                        public int compare(Toy o1, Toy o2) {
                            return o1.getChildAgeGroups().compareTo(o2.getChildAgeGroups());
                        }
                    });
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
