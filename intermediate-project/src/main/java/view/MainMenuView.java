package view;


import view.abstraction.View;

public class MainMenuView extends View {
    private String[] menu = {"Show room", "Add element", "Remove all elements", "Sort elements", "Find special elements", "Add age group", "Change budget"};


    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }


    public void menu() {
        super.menu(menu);
    }
}