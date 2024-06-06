package com.demo.stack;

import java.util.Stack;

public class OtherStackEx {
    public static String decimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binaryNumber = new StringBuilder();

        while (number > 0) {
            int remainder = number % 2;
            stack.push(remainder);
            number /= 2;
        }

        while (!stack.isEmpty()) {
            binaryNumber.append(stack.pop());
        }

        return binaryNumber.toString();
    }

    public static void main(String[] args) {
        int number1 = 32;
        int number2 = 78;

        System.out.println("Decimal: " + number1 + " -> Binary: " + decimalToBinary(number1));
        System.out.println("Decimal: " + number2 + " -> Binary: " + decimalToBinary(number2));
    }
}
