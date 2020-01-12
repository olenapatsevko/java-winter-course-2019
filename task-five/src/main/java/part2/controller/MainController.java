package part2.controller;

import part2.model.GeneratedList;
import part2.model.GeneratedSet;
import part2.view.MainView;

public class MainController {

    public static void start() {
        try {


            GeneratedList<Number> generatedList = new GeneratedList<Number>(
                    Double.parseDouble(MainView.scan("Low boundary")),
                    Double.parseDouble(MainView.scan("High boudary")));

            GeneratedSet<Number> generatedSet = new GeneratedSet<>(
                    generatedList.getLowBoundary(),
                    generatedList.getHighBoundary());
            int size = Integer.parseInt(MainView.scan("Enter size"));
            for (int i = 0; i < size; i++) {

                generatedList.generateList(generatedList.generate());
                generatedSet.generateSet(generatedSet.generate());

            }

            MainView.print(generatedList.toString());
            MainView.print(generatedSet.toString());
        } catch (Exception e) {
            start();
        }
    }
}
