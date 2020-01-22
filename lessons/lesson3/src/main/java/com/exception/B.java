package com.exception;

public class B {

    public static void main(String[] args) {

    }

    public static int validate(int n) {

        try {
            throw null;

        } finally {
            throw new RuntimeException("finally");
        }
    }
}
