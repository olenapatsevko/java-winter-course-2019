package control;

import control.abstraction.Controller;

import java.util.ArrayList;
import java.util.List;

public class MainController extends Controller {
    private List<Controller> controllers = new ArrayList<>();

    @Override
    public void start() {
        controllers.add(new StartMenuController());
        controllers.add(new MainMenuController());
        startControllers();

    }

    private void startControllers() {
        for (Controller c : controllers) {
            c.start();
        }
    }
}
