package com.logicworkusa.qa.ch06operators.ch04logical;
public class Test04CombinedLogical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;

        boolean result = (a && b) || (c && !b); // Combination of Logical Operators
        System.out.println("Result: " + result);
    }
}
