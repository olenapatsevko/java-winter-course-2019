package part1;


import part1.Comparators.ToyComparatorName;
import part1.Comparators.ToyComparatorPrice;
import part1.Comparators.ToyComparatorSize;

import java.util.ArrayList;


public class PlayRoom <T extends Toy>  {

    public double countPrices (ArrayList<T> toy){
       double sum = 0;
        for (T t: toy){
            sum += t.getPrice();
        }
        return sum;
    }

    public ArrayList<T> sortBy(ArrayList<T> toys, String param){
        switch (param){
            case "Price":
                toys.sort(new ToyComparatorPrice());
            case "Size" :
                toys.sort(new ToyComparatorSize());
            case "Name" :
                toys.sort(new ToyComparatorName());
        }
        return toys;
    }


}
