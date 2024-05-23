package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemovalEx {
    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 8, 6, 7, 8, 9, 9, 10, 10);
        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream().distinct().collect(Collectors.toList());
        System.out.println(numbersWithoutDuplicates);

    }
}