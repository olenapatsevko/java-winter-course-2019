package com.firstLesson.tester;

public class TestDemo {
    public static void main(String[] args) throws Exception {
        TestRunner testRunner = new TestRunner();
        testRunner.run(MyTest.class);
    }
}