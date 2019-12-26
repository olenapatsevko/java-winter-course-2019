package control;

import control.abstraction.Controller;

import java.util.ArrayList;
import java.util.List;

public class MainController extends Controller {
    private List<Controller> controllers = new ArrayList<>();

    /**
     * adds all controllers and run them in queue
     */
    @Override
    public void start() {
        controllers.add(new StartMenuController());
        controllers.add(new MainMenuController());
        startControllers();

    }


    /**
     * starts a controller
     */
    private void startControllers() {
        for (Controller c : controllers) {
            c.start();
        }
    }
}
