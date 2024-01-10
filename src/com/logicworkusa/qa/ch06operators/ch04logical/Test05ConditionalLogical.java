package com.logicworkusa.qa.ch06operators.ch04logical;
public class Test05ConditionalLogical {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = 20;

        if ((x > y) && (z > y)) { // Using Logical Operators in if statement
            System.out.println("Condition met");
        } else {
            System.out.println("Condition not met");
        }
    }
}
