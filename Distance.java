package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        System.out.println("Enter the value of x and y: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        euclideanDistance(x,y);
    }
    private static void euclideanDistance(int x,int y) {
        double distance = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println("Euclidean Distance is: " +distance);
    }
}
