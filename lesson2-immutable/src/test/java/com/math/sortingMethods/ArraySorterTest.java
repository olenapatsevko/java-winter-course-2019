package com.math.sortingMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraySorterTest {

    int[] anInt;
    int[] anIntSorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArraySorter arraySorter = new ArraySorter();

    @BeforeEach
    public void setAnInt() {
        anInt = new int[]{9, 2, 6, 3, 8, 7, 1, 5, 4};
    }

    @Test
    public void testWithBubbleSort() {
        arraySorter.bubbleSort(anInt);
        assertArrayEquals(anIntSorted, anInt);
    }


    @Test
    public void testWithInsertionSort() {
        arraySorter.insertionSort(anInt);
        assertArrayEquals(anIntSorted, anInt);
    }

    @Test
    public void testWithSelectionSort() {
        arraySorter.selectionSort(anInt);
        assertArrayEquals(anIntSorted, anInt);
    }
}