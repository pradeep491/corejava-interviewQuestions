package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LastElementOfStringEx {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("java","ruby","C++","python","Junit");
        System.out.println(list);
        Optional<String> lastElement = list.stream().reduce((first,second)->second);
        lastElement.ifPresent(element -> System.out.println("The last element is: " + element));
    }
}