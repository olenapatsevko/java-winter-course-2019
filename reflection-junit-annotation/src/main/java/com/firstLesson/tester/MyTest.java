package com.firstLesson.tester;

import com.firstLesson.tester.annotations.After;
import com.firstLesson.tester.annotations.Before;
import com.firstLesson.tester.annotations.Test;

import static java.lang.System.out;

public class MyTest {

    @Before
    public void init1() {
        out.println("Before tests1");
    }

    @Before
    public void init2() {
        out.println("Before tests2");
    }

    @After
    public void after1() {
        out.println("After tests1");
    }


    @After
    public void after2() {
        out.println("After tests2");
    }

    @Test
    public void test1() {
        out.println("Test1");
    }


    @Test(expected = NullPointerException.class)
    public void test2() {
        out.println("Test2");
        throw new NullPointerException();

    }


    private void testWithoutAnnotation() {
        out.println("Test without annotation");
    }
}
