package com.java.FirstJava;

import java.util.Scanner;

public class EvenorOdd {

    // To check if given number is even or odd

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");  // entering number
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        int result = (num1 > num2) ? num1 : num2; // using ternary operator
        System.out.println("Largest number : " + result);
    }
}
