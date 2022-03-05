package com.java.conditionsandloops;

import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= s.nextInt();
        System.out.println("Enter 2nd number");
        int num2= s.nextInt();
        int hcf=0;
        int les= (num1>num2)? num2: num1;
        for(int i=1; i<= les; i++){
            if(num1%i == 0 && num2 %i ==0){
                hcf= i;
            }
        }
        System.out.println("HCF : "+ hcf);
        int lcm= Math.max(num1, num2);
        while(true){
            if (lcm% num1 ==0 && lcm % num2 ==0){
                System.out.println("LCM : "+ lcm);
                break;
            }
            lcm++;
        }

    }
}
