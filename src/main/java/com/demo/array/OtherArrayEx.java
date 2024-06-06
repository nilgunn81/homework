package com.demo.array;

public class OtherArrayEx {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 3, 15, 7, 1, 19, 16};
        int size = numbers.length;

        System.out.println("Sıralamadan önce:");
        printArray(numbers, size);
        bubbleSort(numbers, size);

        System.out.println("Sıralamadan sonra:");
        printArray(numbers, size);
    }

    public static void bubbleSort(int[] numbers, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
