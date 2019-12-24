package part1.generic;


import part1.Comparators.ToyComparatorName;
import part1.Comparators.ToyComparatorPrice;
import part1.Comparators.ToyComparatorSize;
import part1.toys.toy.Toy;

import java.util.List;


public class PlayRoom <T extends Toy>  {

    public double countPrices (List<T> toy){
       double sum = 0;
        for (T t: toy){
            sum += t.getPrice();
        }
        return sum;
    }

    public List<T> sortBy(List<T> toys, String param){
        switch (param){
            case "Price":
                toys.sort(new ToyComparatorPrice());
                break;
            case "Size":
                toys.sort(new ToyComparatorSize());
                break;
            case "Name":
                toys.sort(new ToyComparatorName());
                break;
            default:
                break;
        }
        return toys;
    }

    public List<T> findAppropriate(List<T> toy, T lowBount, T highBound, String... params) {

        for (String s : params) {

            switch (s) {


                case "Price":
                    for (int i = 0; i < toy.size(); i++) {
                        if (!(toy.get(i).getPrice() >= lowBount.getPrice() && toy.get(i).getPrice() <= highBound.getPrice())) {
                            toy.remove(i);
                            i--; //NOSONAR
                        }
                    }
                    break;


                case "Size":
                    for (int i = 0; i < toy.size(); i++) {
                        if (!(toy.get(i).getSize() >= lowBount.getSize() && toy.get(i).getSize() <= highBound.getSize())) {
                            toy.remove(i);
                            i--;  //NOSONAR
                        }
                    }
                    break;


                case "Name":
                    for (int i = 0; i < toy.size(); i++) {
                        if (!(toy.get(i).getName().equalsIgnoreCase(lowBount.getName()) && toy.get(i).getName().equalsIgnoreCase( highBound.getName()))) {
                            toy.remove(i);
                            i--;
                        }
                    }
                    break;

                default: break;
            }
        }
        return toy;
    }
            }



