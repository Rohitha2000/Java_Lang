package com.java.FirstJava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 = str2 + str.charAt(i);
        }

        if (str.equalsIgnoreCase(str2)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
