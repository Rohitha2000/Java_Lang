package com.java.FirstJava;

import java.util.Scanner;

public class Fibonacci {

    // To print Fibonacci number upto N numbers

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int fibNum = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int c_num=0;
        while ( num2 <= fibNum) {
            System.out.print((num1 + num2) + "  ");
            c_num = num1 + num2;
            num1 = num2;
            num2 = c_num;
        }

    }
}
