package com.java.FirstJava;

import java.util.Scanner;

public class CurrencyConverter {

    // To convert rupees to USD

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rupee");
        float rupee = input.nextFloat();
        System.out.println("USD : $" + String.format("%.2f", (rupee / 76.00)));
    }
}
