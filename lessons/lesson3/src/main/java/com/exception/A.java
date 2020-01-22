package com.exception;

public class A {

    public static void main(String[] args) {
        method(100);
    }

    private static void method(int n) {
        try {
            validator(n);

        } finally {
            System.out.println("finally");
        }
        System.out.println(n);
    }

    public static int validator(int n) throws RuntimeException {
        if (n > 10) {
            throw new RuntimeException();
        }
        return n;
    }
}
