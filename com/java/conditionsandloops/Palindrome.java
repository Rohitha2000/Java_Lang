package com.java.conditionsandloops;

import java.util.Scanner;

public class Palindrome {

    // To find if number is palindrome or not

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();
        int temp = num;
        int rem = 0;
        while (temp > 0) {
            int r = temp % 10;
            rem = rem * 10 + r;
            temp /= 10;
        }
        if (rem == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
