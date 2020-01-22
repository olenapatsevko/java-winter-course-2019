package com.math.fibonacci;

/**
 * expected that Fibonacci sequence begins with number 0 and we count it as a 0-index, so
 * the example of sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. where
 * 0, 1, 2, 3, 4, 5, 6, 7,  8,  9,  10, 11, 12, are indexes of the sequence
 */
public class FibonacciNumbers {

    public int notRecursiveFibonacci(int index) {
        int n0 = 0;
        int n1 = 1;
        for (int i = 2; i <= index; ++i) {
            int next = n0 + n1;
            n0 = n1;
            n1 = next;
        }

        return index < 2 ? index : n1;
    }

    public int recursiveFibonacci(int n) {
        n = Math.abs(n);
        return n <= 1 ? n : recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}

