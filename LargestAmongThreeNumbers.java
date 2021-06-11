package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("Enter the value for x, y and z");
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        if(x>y && x>z)
            System.out.println("x is largest among three");
        else if(y>x && y>z)
            System.out.println("y is largest among three");
        else
            System.out.println("z is largest among three");

    }
}
