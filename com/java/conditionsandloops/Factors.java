package com.java.conditionsandloops;

import java.util.Scanner;

public class Factors {

    // To print factors of number
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to find its factors");
        int number = s.nextInt();
        System.out.println("Factors of  " + number + "\n");
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.print(i + "  ");
            }
        }
        System.out.print(number);
    }
}
