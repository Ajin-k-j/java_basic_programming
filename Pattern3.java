package com.ilpbatch4.utility;

public class Pattern3 {

    public static void main(String[] args) {
        int input = 6; // Define the input size of the pattern
        printPattern(input);
    }

    private static void printPattern(int input) {
        // Loop to handle the number of rows
        for (int row = 1; row <= input; row++) {
            // ASCII value for 'A'
            int asciiValue = 65;
            // Calculate the number of leading spaces
            int numLeadingSpaces = input - row + 1;

            // Print leading spaces
            for (int space = 1; space < numLeadingSpaces; space++) {
                System.out.print(" ");
            }

            // Print increasing characters from 'A'
            for (int col = 1; col <= row; col++) {
                System.out.print(Character.toString((char) asciiValue));
                asciiValue++;
            }

            // Print increasing numbers starting from 1
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
            }
            

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
