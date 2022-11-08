package com.java.conditionsandloops;

import java.util.Scanner;

public class DistancebwPoints {

    // To find the distance bw 2 points

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter x1");
        int x1= s.nextInt();
        System.out.println("Enter  x2");
        int x2= s.nextInt();
        System.out.println("Enter y1");
        int y1= s.nextInt();
        System.out.println("Enter y2");
        int y2= s.nextInt();
        float Xx= (x1-x2) * (x1-x2);
        float Yy= (y1-y2) * (y1-y2);
        float res= (float) Math.sqrt(Xx+ Yy);
        System.out.println("Distance : " + res+"  "+ Math.pow(2,5));

    }
}
