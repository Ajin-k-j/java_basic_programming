package com.ilpbatch4.utility;

public class Pattern1 {

    public static void main(String[] args) {
        int n = 4; // Input
        printPattern(n);
    }

    private static void printPattern(int n) {
    	int PrintVal=n;
        int size = 2 * n - 1;

        // Fill the 2D array with the pattern
        for (int i = 0; i < size; i++) {
        	if (i==0 || i==size-1) {
        		for (int j=0; j<size;j++) {
        			System.out.print(PrintVal);
        		}
        		System.out.println("");
            }
        	else {
              //leading number	
          	for (int k=1;k<=size-i-1;k++) {
          		System.out.print(PrintVal-1);
              	}
          	System.out.println("");
              }
            
            
        }

        
    }
}
