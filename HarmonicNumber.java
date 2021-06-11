package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class HarmonicNumber {
    static double nthHarmonic(int n) {
        float harmonic = 1;
        for (int i = 2; i <= n; i++) {
            harmonic += (float)1 / i;
        }
        return harmonic;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find nth Harmonic number");
        n=sc.nextInt();
        System.out.print(nthHarmonic(n));
    }
}
