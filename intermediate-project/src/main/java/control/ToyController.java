package control;

import control.abstraction.Controller;
import model.abstraction.Toy;
import model.enums.ChildAgeGroup;
import model.enums.Model;
import model.enums.Size;
import view.ToyView;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ToyController extends Controller {
    private ToyView toyView = new ToyView();
    private ArrayList<Size> sizes = new ArrayList<>();
    private ArrayList<Model> models = new ArrayList<>();
    private ArrayList<ChildAgeGroup> childAgeGroups = new ArrayList<>();
    private ArrayList<Double> prices = new ArrayList<>();

    public void start() {
        initialization();
        sortAll();
        toyView.print(modelPick(pricePick(sizePick(childAgeGroupPick(playingChildRoom.getToys())))).toString());


    }

    private void initialization() {
        for (int i = 0; i < 2; i++) {
            sizes.add(toyView.enterSize());
            models.add(toyView.enterModel());
            childAgeGroups.add(toyView.enterChildAgeGroup());
            prices.add(toyView.price());
        }
    }

    void sortAll() {
        prices.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return (int) (o1 - o2);
            }
        });
        sizes.sort(new Comparator<Size>() {
            @Override
            public int compare(Size o1, Size o2) {
                return o1.compareTo(o2);
            }
        });
        models.sort(new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.compareTo(o2);
            }
        });
        childAgeGroups.sort(new Comparator<ChildAgeGroup>() {
            @Override
            public int compare(ChildAgeGroup o1, ChildAgeGroup o2) {
                return o1.compareTo(o2);
            }
        });
    }

    private List<Toy> pricePick(List<Toy> toys) {
        List<Toy> temp = toys;
        for (int i = 0; i < temp.size(); i++) {
            if (!(temp.get(i).getPrice() >= prices.get(0)) && !(temp.get(i).getPrice() <= prices.get(1))) {
                temp.remove(i);
            }
        }
        return temp;
    }

    private List<Toy> modelPick(List<Toy> toys) {
        List<Toy> temp = toys;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getModel().compareTo(models.get(0)) <= 0 && temp.get(i).getModel().compareTo(models.get(1)) >= 0) {
                temp.remove(i);
            }
        }
        return temp;
    }

    private List<Toy> sizePick(List<Toy> toys) {
        List<Toy> temp = toys;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getSize().compareTo(sizes.get(0)) <= 0 && temp.get(i).getSize().compareTo(sizes.get(1)) >= 0) {
                temp.remove(i);
            }
        }
        return temp;
    }

    private List<Toy> childAgeGroupPick(List<Toy> toys) {
        List<Toy> temp = toys;
        for (int i = 0; i < temp.size(); i++) {
            if (temp.get(i).getChildAgeGroups().compareTo(childAgeGroups.get(0)) <= 0 && temp.get(i).getChildAgeGroups().compareTo(childAgeGroups.get(1)) >= 0) {
                temp.remove(i);
            }
        }
        return temp;
    }
}
