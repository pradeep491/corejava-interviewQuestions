package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // Creating a list of strings
        List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape");

        // Using Java 8 Streams to sort the list alphabetically
        List<String> sortedStrings = strings.stream()
                .sorted()
                .collect(Collectors.toList());

        // Displaying the sorted list
        System.out.println("Sorted list of strings:");
        sortedStrings.forEach(System.out::println);

        // Using Java 8 Streams to sort the list alphabetically in reverse
        List<String> sortedStrings1 = strings.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        // Displaying the sorted list
        System.out.println("Sorted list of strings:");
        sortedStrings1.forEach(System.out::println);
    }
}