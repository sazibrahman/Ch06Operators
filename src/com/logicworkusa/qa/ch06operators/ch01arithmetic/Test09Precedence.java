package com.logicworkusa.qa.ch06operators.ch01arithmetic;
public class Test09Precedence {
    public static void main(String[] args) {
        int result = 5 + 3 * 7; // Without parentheses
        int resultWithParentheses = (5 + 3) * 7; // With parentheses
        System.out.println("Result without parentheses: " + result);
        System.out.println("Result with parentheses: " + resultWithParentheses);
    }
}
