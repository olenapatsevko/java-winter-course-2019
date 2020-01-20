package com.math.fibonacci;

/**
 * expected that Fibonacci sequence begins with number 0 and we count it as a 0-index, so
 * the example of sequence is 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, …….. where
 * 0, 1, 2, 3, 4, 5, 6, 7,  8,  9,  10, 11, 12, are indexes of the sequence
 */
public class FibonacciNumbers {


    public int NotRecursiveFibonacci(int index) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= index; ++i) {
            int next = a + b;
            a = b;
            b = next;
        }

        return index < 2 ? index : b;
    }

    public int recursiveFibonacci(int n) {
        if (n <= 1)
            return n;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}

