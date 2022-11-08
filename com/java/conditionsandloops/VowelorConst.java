package com.java.conditionsandloops;

import java.util.Scanner;

public class VowelorConst {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter char");
        char ch= s.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i'|| ch=='o'|| ch=='u'){
            System.out.println("Vowel");
        }
        else if(ch == 'A' || ch == 'E' || ch == 'I'|| ch=='O'|| ch=='U'){
            System.out.println("Vowel");
        }
        else if((ch>= 'a'&& ch <= 'z') || (ch>= 'A' && ch <= 'Z')){
            System.out.println("Constant");
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
