package com.java.FirstJava;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number1 = input.nextInt();
        String str = String.valueOf(number1); // number to string
        int length = str.length(); // to find length in easy way
        int result = 0;
        int k = 1;
        while (k <= length) {
            int mul = 1;
            int exponentNum = Integer.parseInt(String.valueOf(str.charAt(k - 1)));
            for (int i = 0; i <= length - 1; i++) {
                mul = mul * exponentNum;
            }
            result = result + mul;
            k++;
        }
        if (number1 == result)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong Number");
    }
}
