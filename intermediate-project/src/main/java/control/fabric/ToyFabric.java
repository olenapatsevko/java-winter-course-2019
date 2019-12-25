package control.fabric;

import model.abstraction.Toy;
import model.enums.Model;
import model.toys.Car;
import model.toys.Cube;
import model.toys.Doll;
import view.ToyView;


public class ToyFabric {
    static ToyView toyView = new ToyView();

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


    public static Doll fillDollParams(Doll doll) {

        doll.setName(toyView.name());
        doll.setPrice(toyView.price());
        doll.setSize(toyView.enterSize());
        doll.setChildAgeGroups(toyView.enterChildAgeGroup());

        return doll;

    }

    public static Car fillCarParams(Car car) {
        car.setName(toyView.name());
        car.setPrice(toyView.price());
        car.setSize(toyView.enterSize());
        car.setChildAgeGroups(toyView.enterChildAgeGroup());
        return car;

    }

    public static Cube fillCubeParams(Cube cube) {
        cube.setPrice(toyView.price());
        cube.setSize(toyView.enterSize());
        cube.setChildAgeGroups(toyView.enterChildAgeGroup());
        return cube;
    }


}
