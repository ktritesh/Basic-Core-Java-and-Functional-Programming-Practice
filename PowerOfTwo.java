package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        int p;
        int i=0;
        int power=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate of its power");
        p=sc.nextInt();
        while (i <= p) {
            System.out.println(i + " " + power);
            power = 2 * power;
            i = i + 1;
        }
    }
}
