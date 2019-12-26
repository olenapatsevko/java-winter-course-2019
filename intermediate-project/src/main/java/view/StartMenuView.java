package view;

import view.abstraction.View;

public class StartMenuView extends View {

    /**
     * start menu items
     */
    private String[] startMenu = {"Enter budget", " Enter age group"};


    public void menu() {
        super.menu(startMenu);
    }

    public String[] getStartMenu() {
        return startMenu;
    }

    public void setStartMenu(String[] startMenu) {
        this.startMenu = startMenu;
    }


}
