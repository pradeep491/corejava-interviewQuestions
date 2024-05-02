package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Integer[] array = {5, 10, 3, 7, 2, 10, 5};
        Integer[] distinct = Arrays.stream(array)
                .distinct()
                .toArray(Integer[]::new);
        System.out.println("Distinct elements: " + Arrays.toString(distinct));
    }
}