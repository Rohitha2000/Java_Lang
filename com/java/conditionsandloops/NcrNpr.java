package com.java.conditionsandloops;

import java.util.Scanner;

public class NcrNpr {

    // To find nCr and nPr

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter total no of things");
        int n= s.nextInt();
        System.out.println("Enter number of things choosen out of n");
        int r= s.nextInt();
        float nPr= (float) (NcrNpr.factorial(n)/ NcrNpr.factorial(n-r));
        float base= (float)( NcrNpr.factorial(r) * NcrNpr.factorial(n-r));
        float nCr= (float) (NcrNpr.factorial(n) / base);
        System.out.println("nPr : "+ nPr);
        System.out.println("nCr : "+ nCr);

    }
   static int factorial(int number) {
        int temp = number;
        int fact = 1;
        while (temp > 0) {
            fact = fact * temp;
            temp--;
        }
        return fact;
    }

}
