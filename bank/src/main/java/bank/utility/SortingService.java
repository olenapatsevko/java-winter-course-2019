package bank.utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingService<E extends Comparable<E>> implements Sortable<E> {

    @Override
    public void sort(List<E> list) {
        Collections.sort(list);
    }

    @Override
    public void sort(List<E> list, Comparator<E> comparator) {
        list.sort(comparator);
    }

    @Override
    public void sort(E[] array) {
        Arrays.sort(array);
    }

    @Override
    public void sort(E[] array, Comparator<E> comparator) {
        Arrays.sort(array, comparator);

    }

}
