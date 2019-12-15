package part1;


import java.util.ArrayList;

public class PlayRoom <T extends Toy>  {

    public double countPrices (ArrayList<T> toy){
       double sum = 0;
        for (T t: toy){
            sum += t.getPrice();
        }
        return sum;
    }



}
