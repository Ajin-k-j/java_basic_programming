package com.ilpbatch4.utility;

public class ZPattern {

	public static void main(String[] args) {
		int n=5;
		
		pattern(n);

	}

	private static void pattern(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>0; j--) {
				if(i==1 || i==n || i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		
	}

}
