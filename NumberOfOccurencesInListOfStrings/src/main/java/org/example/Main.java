package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
        String word = "java";
        long count = strings.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .filter(w -> w.equals(word))
                .count();
        System.out.println("Occurrences of \"" + word + "\": " + count);
        }
    }