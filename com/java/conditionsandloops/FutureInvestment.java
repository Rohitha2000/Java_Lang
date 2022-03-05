package com.java.conditionsandloops;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter amount");
        float pamt= s.nextFloat();
        System.out.println("Enter rate %");
        float rate= s.nextFloat();
        rate= 1 +(rate/100);
        System.out.println("Enter years");
        int year= s.nextInt();
        float fv= (float) ( Math.pow(rate, year));
        fv *= pamt;
        System.out.println(String.format("Future Investment Value : %.2f",fv));
    }
}
