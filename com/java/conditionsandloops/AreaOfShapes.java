package com.java.conditionsandloops;

import java.util.Scanner;

public class AreaOfShapes {

    // Printing area of shapes

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter radius for circle");
        int rad = s.nextInt();
        System.out.println("Area  of Circle : " + (3.1416 * rad * rad));
        System.out.println("Enter base for triangle");
        int base = s.nextInt();
        System.out.println("Enter height for triangle");
        int height = s.nextInt();
        System.out.println("Area of Triangle : " + (0.5 * base * height));
        System.out.println("Enter length for rectangle");
        int length = s.nextInt();
        System.out.println("Enter breadth for rectangle");
        int breadth = s.nextInt();
        System.out.println("Area of Rectangle : " + (length * breadth));
        System.out.println("Isosceles traingle area is same as triangle");
        System.out.println("Area of Parallelogram : " + breadth * height);
        System.out.println("Enter size for equilateral triangle");
        int area = s.nextInt();
        System.out.println("Area of Equilateral triangle : " + (0.433 * area * area));
        System.out.println("Enter diagonal for rhombus ");
        int p = s.nextInt();
        System.out.println("Enter diagonal 2 for rhombus");
        int q = s.nextInt();
        System.out.println("Area of Rhombus : " + (p * q / 2));


    }
}
