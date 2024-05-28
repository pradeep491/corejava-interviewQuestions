package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        OptionalInt max = list.stream().mapToInt(Integer::intValue).max();
        OptionalInt min = list.stream().mapToInt(Integer::intValue).min();
        max.ifPresent(m -> System.out.println("Maximum Value::" + m));
        min.ifPresent(m -> System.out.println("Minimum Value::" + m));
    }
}