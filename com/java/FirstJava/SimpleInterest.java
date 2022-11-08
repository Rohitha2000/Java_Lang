package com.java.FirstJava;

import java.util.Scanner;

public class SimpleInterest {
    // To print the Simple Interest

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float pamount = input.nextFloat();
        int time = input.nextInt();
        int rate = input.nextInt();
        System.out.println("Simple Interest : " + (pamount * time * rate) / 100);
    }
}
