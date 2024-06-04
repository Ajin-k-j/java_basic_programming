package com.ilpbatch4.utility;

public class SumOfSeries1 {

	public static void main(String[] args) {
		int input=8;
		SumOfSeries(input);
		

	}

	private static void SumOfSeries(int input) {
		int sum=0;
		int swap=0;
		for (int i=1; i<=input;i++) {
			if(i%2!=0) {
				if (swap==0) {
					sum+=i;
					swap=1;
				}
				else {
					sum-=i;
					swap=0;
				}
			}
		}
		System.out.println(sum);
		
	}

}
