package com.java.conditionsandloops;

import java.util.Scanner;

public class Factorial {

    // To print factorial of given number

    public static void main(String[] args) {
        int number;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter number");
        number= s.nextInt();
        int temp= number;
        int fact=1;
        while(temp>0){
            fact= fact * temp;
            temp--;
        }
        System.out.println("Factorial is : "+ fact);
    }
}
