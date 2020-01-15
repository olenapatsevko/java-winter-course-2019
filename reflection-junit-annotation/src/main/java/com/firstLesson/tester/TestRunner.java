package com.firstLesson.tester;

import com.firstLesson.tester.annotations.*;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TestRunner {

    public void run(Class<?> clazz) throws Exception {
        Constructor<?> constructor = clazz.getConstructor();
        Object object = constructor.newInstance();
        Method[] declaredMethods = clazz.getDeclaredMethods();
        List<Method> beforeMethods = getMethodsByAnnotation(Before.class, declaredMethods);
        List<Method> afterMethods = getMethodsByAnnotation(After.class, declaredMethods);
        List<Method> afterAllMethods = getMethodsByAnnotation(AfterAll.class, declaredMethods);
        List<Method> beforeAllMethods = getMethodsByAnnotation(BeforeAll.class, declaredMethods);

        if (declaredMethods.length > 0) {
            runAllMethods(beforeAllMethods, object);
        }

        for (Method method : declaredMethods) {
            if (method.isAnnotationPresent(Test.class)) {
                runAllMethods(beforeMethods, object);
                checkAnnotationParam(method.getAnnotation(Test.class).expected(), method.getAnnotation(Test.class).expectedMessage(), method, object);
                runAllMethods(afterMethods, object);
            }
        }

        if (declaredMethods.length > 0) {
            runAllMethods(afterAllMethods, object);
        }

    }

    private void checkAnnotationParam(Class<? extends Throwable> expected, String expectedMessage, Method method, Object object) {
        try {
            method.invoke(object);
        } catch (Exception e) {
            if (!(e.getMessage().equalsIgnoreCase(expectedMessage) && e.getClass().getSimpleName().equals(expected.getSimpleName()))) {
                throw new IllegalArgumentException("Wrong annotation params");
            }

        }
    }

    private List<Method> getMethodsByAnnotation(Class<? extends Annotation> annotation, Method[] methods) {
        ArrayList<Method> annotatedMethods = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(annotation)) {
                annotatedMethods.add(method);
            }
        }
        return annotatedMethods;
    }

    private void runAllMethods(List<Method> methodList, Object object) {
        for (Method method : methodList) {
            try {
                method.invoke(object);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}