package com.logicworkusa.qa.ch06operators.ch01arithmetic;
public class Test10MixedOperations {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        int mixedResult = (a + b) * (a - b) / (a % b);
        System.out.println("Mixed result: " + mixedResult);
    }
}
