package com.demo.stack;

import java.util.Stack;

public class StackEx {
    public static String reverseWords(String sentence) {
        Stack<String> stack = new Stack<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversedSentence = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedSentence.append(stack.pop());
            if (!stack.isEmpty()) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String sentence1 = "Hello World";
        String sentence2 = "Java stack example";

        System.out.println("Original: " + sentence1);
        System.out.println("Reversed: " + reverseWords(sentence1));

        System.out.println("Original: " + sentence2);
        System.out.println("Reversed: " + reverseWords(sentence2));
    }
}
