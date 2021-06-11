package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int x,y;
        System.out.println("Enter the value for x");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Enter the value for y");
        y=sc.nextInt();
        System.out.println("Before Swapping value of x is "+x);
        System.out.println("Before Swapping value of y is "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swapping value of x is "+x);
        System.out.println("After swapping value of y is "+y);

    }
}
