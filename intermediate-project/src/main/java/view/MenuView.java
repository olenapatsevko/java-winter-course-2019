package view;

import view.abstraction.View;

public class MenuView extends View {
    private String[] menu = {"Show room", "Add element", "Remove all elements", "Sort elements", "Find special elements", "Add age group", "Change budget"};

    private String[] startMenu = {"Enter budget", " Enter age group"};


    public void menu(String[] m) {
        for (int i = 0; i < m.length; i++) {
            print(i + 1 + m[i]);
        }
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    public String[] getStartMenu() {
        return startMenu;
    }

    public void setStartMenu(String[] startMenu) {
        this.startMenu = startMenu;
    }


}
