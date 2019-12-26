package control.fabric;

import model.abstraction.Toy;
import model.enums.Model;
import model.toys.Car;
import model.toys.Cube;
import model.toys.Doll;
import view.ToyView;


/**
 * class that allows to create new Toy objects using the enum model (presentation of a fabric pattern)
 */
public class ToyFabric {
    static ToyView toyView = new ToyView();

    /**
     * @param model model of a toy
     * @return toy of entered model
     */
    public static Toy createToy(Model model) {

        switch (model) {
            case DOLL: {
                return fillDollParams(new Doll(model));
            }
            case CAR: {
                return fillCarParams(new Car(model));
            }
            case CUBE: {
                return fillCubeParams(new Cube(model));
            }


        }
        return new Doll(Model.DOLL);

    }


    /**
     * @param doll empty Doll object
     * @return doll object filled with values
     */
    public static Doll fillDollParams(Doll doll) {

        doll.setName(toyView.name());
        doll.setPrice(toyView.price());
        doll.setSize(toyView.enterSize());
        doll.setChildAgeGroups(toyView.enterChildAgeGroup());

        return doll;

    }

    /**
     * @param car empty Car object
     * @return car object filled with values
     */
    public static Car fillCarParams(Car car) {
        car.setName(toyView.name());
        car.setPrice(toyView.price());
        car.setSize(toyView.enterSize());
        car.setChildAgeGroups(toyView.enterChildAgeGroup());
        return car;

    }

    /**
     * @param cube empty Cube object
     * @return cube object filled with values
     */
    public static Cube fillCubeParams(Cube cube) {
        cube.setPrice(toyView.price());
        cube.setSize(toyView.enterSize());
        cube.setChildAgeGroups(toyView.enterChildAgeGroup());
        return cube;
    }


}
