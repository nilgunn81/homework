package com.demo;

import java.util.ArrayList;

public class List {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        java.util.List<Integer> numbers = new ArrayList<>();
        for (int i = 2; i < 90; i++) {
            numbers.add(i);
        }

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not  a prime number.");

            }
        }

    }
}
