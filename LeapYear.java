package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        boolean leap = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to check whether it Leap year or not");
        year=sc.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0)
                    leap=true;
                else
                    leap=false;
            }
            else
                leap=true;
        }
        else
            leap=false;
        if(leap)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+" is not a leap year");
    }
}
