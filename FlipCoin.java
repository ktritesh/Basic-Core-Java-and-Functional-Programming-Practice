package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int tailCount=0;
        int headCount=0;

        double coinResult;
        int count;
        System.out.println("Enter number of times you want to flip the coin");
        Scanner sc = new Scanner(System.in);
        count=sc.nextInt();

        for (int i=1; i<=count; i++){
            coinResult= Math.random();
            System.out.println(coinResult);
            if(coinResult<0.5){
                tailCount++;
            }else{
                headCount++;
            }
        }
        double headPercentage = (headCount/count)*100;
        double tailPercentage = (tailCount/count)*100;
        System.out.println("Head Percentage "+headPercentage);
        System.out.println("Tail Percentage "+tailPercentage);
    }
}
