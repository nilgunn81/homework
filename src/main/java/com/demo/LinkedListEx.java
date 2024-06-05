package com.demo;

import java.util.List;

public class LinkedList {
    public static void main(String[] args) {
        List<Integer> numbers = (List<Integer>) new LinkedList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("LinkedList: " + numbers);

        System.out.println("First element: " + numbers.get(0));
        System.out.println("Last element: " + numbers.get(numbers.size() - 1));

        numbers.add(2, 10); // 2. indekse 10 ekle
        System.out.println("After adding 10 at index 2: " + numbers);

        numbers.remove(3); // 3. indeksteki elemanı kaldır
        System.out.println("After removing element at index 3: " + numbers);

        for (int number : numbers) {
            System.out.println(number);
        }

        for (int number : numbers) {
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

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

}
