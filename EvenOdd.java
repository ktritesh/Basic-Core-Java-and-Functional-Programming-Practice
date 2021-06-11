package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
	    int n;
	    System.out.println("Enter the number to check even or odd");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        if(n%2==0)
            System.out.println("You entered a even number");
        else
            System.out.println("you entered a odd number");
    }
}
