package org.example;

import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String someString = "JAVA PROGRAMMER";
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
    }
}