package com.java.conditionsandloops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter nuber");
        int num= s.nextInt();
        int perfect= 0;
        for(int i=1;i<=num/2; i++){
            if(num%i == 0){
                perfect += i;
            }
        }
        if(num == perfect){
            System.out.println("Perfect Number");
        }
        else {
            System.out.println("Not perfect");
        }
    }
}
