package org.example;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String someString = scanner.nextLine();

        //String someString = "JAVA PROGRAMMER";
        char[] strArray = someString.toCharArray();

        //getting distinct characters in strArray
        Set<Character> set = new TreeSet<>();
        for (char c : strArray){
            set.add(c);
        }
        //set.forEach(System.out::println);

        for (char c : set) {
            // Using Streams & Lambda Expressions in Java 8
            long count = someString.chars().filter(ch -> ch == c).count();
            System.out.println("Occurances of Character '" +c+ "' : " +count);
        }

        //another way
        someString.chars() // Convert the String to an IntStream
                .mapToObj(c -> (char) c) // Convert each int in the stream to a char
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Group by character and count them
                .forEach((character, frequency) -> System.out.println(character + ":" + frequency));
    }
}