package com.math.fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumbersTest {
    private FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();

    @Test
    public void sixthMemberOfFibonacci() {
        assertEquals(13, fibonacciNumbers.recursiveFibonacci(7));
        assertEquals(13, fibonacciNumbers.NotRecursiveFibonacci(7));
    }

    @Test
    public void zeroMemberOfFibonacci() {
        assertEquals(0, fibonacciNumbers.recursiveFibonacci(0));
        assertEquals(0, fibonacciNumbers.NotRecursiveFibonacci(0));
    }


    @Test
    public void firstMemberOfFibonacci() {
        assertEquals(1, fibonacciNumbers.recursiveFibonacci(1));
        assertEquals(1, fibonacciNumbers.NotRecursiveFibonacci(1));
    }

    @Test
    public void secondMemberOfFibonacci() {
        assertEquals(1, fibonacciNumbers.recursiveFibonacci(2));
        assertEquals(1, fibonacciNumbers.NotRecursiveFibonacci(2));
    }

    @Test
    public void thirdMemberOfFibonacci() {
        assertEquals(2, fibonacciNumbers.recursiveFibonacci(3));
        assertEquals(2, fibonacciNumbers.NotRecursiveFibonacci(3));
    }

    @Test
    public void tenthMemberOfFibonacci() {
        assertEquals(55, fibonacciNumbers.recursiveFibonacci(10));
        assertEquals(55, fibonacciNumbers.NotRecursiveFibonacci(10));
    }

    @Test
    public void twentiesMemberOfFibonacci() {
        assertEquals(6765, fibonacciNumbers.recursiveFibonacci(20));
        assertEquals(6765, fibonacciNumbers.NotRecursiveFibonacci(20));
    }

}