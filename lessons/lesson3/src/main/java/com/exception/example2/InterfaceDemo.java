package com.exception.example2;

public class InterfaceDemo {
    public static void main(String[] args) {
        MyInterface anon = new MyInterface() {

            @Override
            public void method() {
                System.out.println("anon");
            }

            @Override
            public void method1() {

            }
        };
        MyInterface lambda = () -> System.out.println("maxma");
        anon.method();
        lambda.method();

        OneParamFuncIn<String> oneParamFuncIn = message -> {
            System.out.println(message.isEmpty());
        };

        oneParamFuncIn.method("baba");
        TwoParamsFunc twoParamsFunc = (message, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
            }
        };
        twoParamsFunc.method("mama", 34);
    }
}
