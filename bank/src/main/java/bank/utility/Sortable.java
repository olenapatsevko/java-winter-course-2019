package bank.utility;

import java.util.Comparator;
import java.util.List;

public interface Sortable<E extends Comparable<E>> {

    void sort(E[] array);

    void sort(List<E> list);

    void sort(E[] array, Comparator<E> comparable);

    void sort(List<E> list, Comparator<E> comparable);

}
