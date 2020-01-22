package com.firstLesson;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<A> aClass = A.class;
        Constructor<A> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        A a = constructor.newInstance();

        Method method = aClass.getDeclaredMethod("staticMethod");
        method.setAccessible(true);
        Object invoke = method.invoke(null);

        Class<Size> sizeClass = Size.class;
        Field[] fields = sizeClass.getFields();
        out.println(Arrays.toString(fields));
        out.println(sizeClass.isEnum());
        Class<? extends Enum> en = Enum.class;
        Constructor<? extends Enum> constructor1 = en.getDeclaredConstructor();
        constructor1.setAccessible(true);
        Enum anEnum = constructor1.newInstance();
        try {
            Enum.valueOf((Class<? extends Enum>) Class.forName("Enum"), "E");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

class A {

    private A() {

    }

    public void method() {
        out.println("non-static method");
    }

    private static void staticMethod() {
        out.println("Static method");
    }
}
