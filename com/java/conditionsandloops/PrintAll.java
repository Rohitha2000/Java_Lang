package com.java.conditionsandloops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintAll {
    public static void main(String[] args) {
//Take integer inputs till the user enters 0 and print the sum of all numbers
// And also print largest element of all numbers
        Scanner s = new Scanner(System.in);
        int number, result = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter numbers");
        while (true) {
            number = s.nextInt();
            if (number == 0) {
                break;
            } else {
                arr.add(number);
                result += number;
            }
        }

        System.out.println("Sum of Numbers: " + result);
        System.out.println("Largest of Numbers: " + Collections.max(arr));
    }
}
