package com.math.factorial;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {
    private static Map<Integer, BigInteger> map;
    private static Factorial factorial;


    @BeforeAll
    public static void before() {

        map = new HashMap<>() {{
            put(0, new BigInteger("0"));
            put(1, new BigInteger("1"));
            put(2, new BigInteger("2"));
            put(3, new BigInteger("3"));
            put(4, new BigInteger("4"));
            put(5, new BigInteger("5"));
            put(6, new BigInteger("6"));
            put(24, new BigInteger("24"));
            put(120, new BigInteger("120"));
        }};
        factorial = new Factorial();


    }


    @Test
    public void factorialOfZero() {
        assertEquals(map.get(1), factorial.factorialNumber(map.get(0)));

    }

    @Test
    public void factorialOfNumberFive() {
        assertEquals(map.get(120), factorial.factorialNumber(map.get(5)));

    }

    @Test
    public void factorialOfNumberTwo() {
        assertEquals(map.get(2), factorial.factorialNumber(map.get(2)));

    }

    @Test
    public void factorialOfNumberOne() {
        assertEquals(map.get(1), factorial.factorialNumber(map.get(1)));

    }

    @Test
    public void factorialOfNumberFour() {
        assertEquals(map.get(24), factorial.factorialNumber(map.get(4)));

    }

}