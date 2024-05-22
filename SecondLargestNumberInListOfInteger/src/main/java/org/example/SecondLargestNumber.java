package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 77, 44, 88, 99, 101, 102, 6, 7, 8, 9, 10);
        Optional<Integer> secondMax = list.stream().distinct()
                .sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondMax.ifPresent(number -> System.out.println("second Largest Number:" + number));

    }
}