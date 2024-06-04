package com.ilpbatch4.utility;

public class SumOfSeries2 {

	public static void main(String[] args) {
		int input=1;
		sumOfSeries(input);
	}

	private static void sumOfSeries(int input) {
		int sum=0;
        int first = 1;
        int second = 2;
        if(input==0) {
        	sum=0;
        }
        if(input==1) {
        	sum=1;
        }
        if (input > 1) {
        	sum+=cube(first);
            sum+=cube(second);
        }

		for (int i = 3; i <= input; i++) {
            int next = first + second;
            sum+=cube(next);
            first = second;
            second = next;
        }
		System.out.println(sum);
				
			}
		
		

	private static int cube(int i) {
		return i*i*i;
	}

}
