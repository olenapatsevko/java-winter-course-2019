package com.lessontwo;

public class A {

    private int code;

    public A(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "A{" +
                "code=" + code +
                '}';
    }

    public void setCode(int code) {
        this.code = code;

    }
}
