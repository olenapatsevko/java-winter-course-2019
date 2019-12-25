package view;


import model.enums.Model;
import view.abstraction.View;

public class MainMenuView extends View {
    private String[] menu = {"Show room", "Add element", "Remove all elements", "Sort elements", "Find special elements", "Add age group", "Exit"};


    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }


    public void menu() {
        super.menu(menu);
    }

    public Model enterModel() {
        for (; ; ) {
            print("Enter model");
            this.printAllEnums(Model.values());
            try {
                return Model.createModel(scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                print("Illegal argument");
            }
        }
    }
}
