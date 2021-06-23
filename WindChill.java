package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the wind speed: ");
        double y = scanner.nextDouble();
        if ( Math.abs(x) <= 50 ){
            if ( y >= 3 && y <=120 ) {
                calculateChill(x,y);
            }
            else
                System.out.println("Wrong input y cannot be larger than 120 or less than 3");
        }
        else
            System.out.println("Wrong input x cannot be larger than 50.");
    }

    private static void calculateChill(double x, double y) {
        double wind=35.74+0.6215*x+(0.4275*x-35.75)*Math.pow(y, 0.16);
        System.out.println("Wind chill value is: " +wind);
    }
}
