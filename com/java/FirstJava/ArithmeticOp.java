package com.java.FirstJava;

import java.util.Scanner;

public class ArithmeticOp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = input.nextInt();
        System.out.println("Enter operator");
        String operator = input.next();
        if (operator.equals("+")) {
            System.out.println("Addition is : " + num1 + num2);
        } else if (operator.equals("-")) {
            System.out.println("Subtraction is : " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Multiplication is : " + num1 * num2);
        } else if (operator.equals("/")) {
            System.out.println("Division is : " + num1 / num2);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
