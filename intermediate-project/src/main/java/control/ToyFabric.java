package control;

import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;
import model.toys.Car;
import model.toys.Cube;
import model.toys.Doll;
import view.ToyView;

public class ToyFabric {
    static ToyView toyView = new ToyView();

    public static Toy createToy(String t) {

        switch (Model.valueOf(t)) {
            case DOLL: {
                Doll doll = new Doll(Model.DOLL);
                return fillDollParams(doll);
            }

            case CAR: {
                Car car = new Car(Model.CAR);
                return fillCarParams(car);
            }

            case CUBE: {
                Cube cube = new Cube(Model.CUBE);
                return fillCubeParams(cube);
            }
        }
        return null;
    }


    public static Doll fillDollParams(Doll doll) {
        toyView.print("Enter doll name");
        doll.setName(toyView.scanString());
        toyView.print("Enter doll price");
        doll.setPrice(toyView.scanNumber());
        doll.setSize(enterSize());
        doll.setChildAgeGroups(enterChildAgeGroup());


        return doll;

    }

    public static Car fillCarParams(Car car) {
        toyView.print("Enter car name");
        car.setName(toyView.scanString());
        toyView.print("Enter car price");
        car.setPrice(toyView.scanNumber());
        car.setSize(enterSize());
        car.setChildAgeGroups(enterChildAgeGroup());
        return car;

    }

    public static Cube fillCubeParams(Cube cube) {
        toyView.print("Enter cube price");
        cube.setPrice(toyView.scanNumber());
        cube.setSize(enterSize());
        cube.setChildAgeGroups(enterChildAgeGroup());
        return cube;
    }

    public static Size enterSize() {
        for (; ; ) {
            toyView.print("Enter size");
            toyView.printAllEnums(Size.values());
            try {
                return Size.createSize(toyView.scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                toyView.print("Illegal argumet");

            }
        }
    }

    public static ChildAgeGroup enterChildAgeGroup() {
        for (; ; ) {
            toyView.print("Enter child group age");
            toyView.printAllEnums(ChildAgeGroup.values());
            try {
                return ChildAgeGroup.createChildAgeGroup(toyView.scanString());
            } catch (IllegalArgumentException | NullPointerException e) {
                toyView.print("Illegal argumet");
            }
        }

    }


}
