package com.ilpbatch4.utility;

public class SumOfSeries3 {

	public static void main(String[] args) {
		int input = 10;
		sumSquare(input);
 
	}
	public static void sumSquare(int input) {
		double sum =0;
		int swap =0;
		int power =1;
		for(int i =1; i<=input;i=i+2) {
			if(swap ==0) {
				sum = sum+ (Math.pow(i, power));
				swap =1;
				power++;
			}
			else {
				sum = sum-(Math.pow(i, power));
				swap =0;
				power++;
			}
		}
		System.out.println(sum);
	}
}
 
