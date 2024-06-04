package com.ilpbatch4.utility;

public class Pattern2 {

    public static void main(String[] args) {
        int n = 5; // Input
        printPattern(n);
    }

    private static void printPattern(int n) {
        int mid = (n + 1) / 2; 

        // Top part
        for (int i = 1; i < mid; i++) {
            for (int j = 0; j < (mid - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Middle part
        for (int i = mid; i > 0; i--) {
            System.out.print(i + " ");
        }
        for (int i = 2; i <= mid; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bottom part
        for (int i = mid - 1; i > 0; i--) {
            for (int j = 0; j < (mid - i); j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
