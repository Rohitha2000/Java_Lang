package com.java.conditionsandloops;

import java.util.Scanner;

public class CompoundInterest {

    // To find the compound interest of a given number

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter principal amount");
        int pamt= s.nextInt();
        System.out.println("Enter rate");
        float Rate= s.nextFloat();
        System.out.println("Enter compound monthly");
        int n= s.nextInt();
        System.out.println("Enter years");
        float year= s.nextFloat();
        float r= Rate/100;
        float brac= (1+ (r/n));
        float power= n* year;
        float compInt= (float) (pamt * Math.pow(brac, power));
        System.out.println("Compound Interest : "+ compInt);
    }
}
