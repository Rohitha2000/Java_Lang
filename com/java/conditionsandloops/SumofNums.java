package com.java.conditionsandloops;

import java.util.Scanner;

public class SumofNums {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int neg=0; int pev=0; int podd=0;
        while (true){
            int num= s.nextInt();
            if(num == 0){
                break;
            }
            else{
                if(num>0){
                    if( num%2 ==0){
                        pev +=num;
                    }
                    else{
                        podd += num;
                    }
                }
                else if(num< 0){
                    neg += num;
                }
            }
        }
        System.out.println("Negative : "+ neg);
        System.out.println("Positive Odd : "+ podd);
        System.out.println("Positive Even : "+ pev);
    }
}
