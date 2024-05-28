package org.example;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number:");
        String number = s.nextLine();

        int sum = number.chars().map(Character::getNumericValue).sum();
        System.out.println("sum of given number is-"+sum);

    }
}