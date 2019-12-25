package control;

import model.abstraction.Toy;
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
                Doll doll = new Doll();
                return fillDollParams(doll);
            }

            case CAR: {
                Car car = new Car();
                return fillCarParams(car);
            }

            case CUBE: {
                Cube cube = new Cube();
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
        toyView.print("Enter size");
        toyView.printAllEnums(Size.values());
        try {
            doll.setSize(Size.createSize(toyView.scanString()));
        } catch (IllegalArgumentException | NullPointerException e) {

        }

        return doll;

    }

    public static Car fillCarParams(Car car) {

        return car;

    }

    public static Cube fillCubeParams(Cube cube) {

        return cube;
    }

    public static Size enterSize() {
        
    }

    public static Model enterModel() {

    }


}
