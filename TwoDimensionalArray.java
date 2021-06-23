package com.bridgelabz.basiccoreprograms;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Rows and Column");
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];

        System.out.println("Insert values in this array [" +rows+ "," +columns+ "] array: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j] = scanner.nextInt();
            }
            System.out.println(" ");
        }
        showArray(array, rows, columns);
    }
    private static void showArray(int[][] array, int rows, int columns) {
        System.out.println("Showing Array : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
