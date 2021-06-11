package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        int dividend, divisor;
        System.out.println("Enter Dividend");
        Scanner sc = new Scanner(System.in);
        dividend=sc.nextInt();
        System.out.println("Enter Divisor");
        divisor=sc.nextInt();

        int quotient = dividend/divisor;
        int remainder= dividend%divisor;

        System.out.println("Quotient is "+ quotient);
        System.out.println("Remainder is "+ remainder);
    }
}
