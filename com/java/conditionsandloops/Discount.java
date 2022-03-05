package com.java.conditionsandloops;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cost price");
        float cp = s.nextFloat();
        System.out.println("Enter selling price");
        float sp = s.nextFloat();
        float discount = ((cp - sp) / cp) * 100;
        System.out.println(String.format("Discount : %.0f", discount) + "%");

    }
}
