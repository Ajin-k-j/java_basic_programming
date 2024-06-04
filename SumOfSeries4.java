package com.ilpbatch4.utility;

public class SumOfSeries4 {

	public static void main(String[] args) {
		int input = 13;
		sumOfFactorial(input);

	}

	private static void sumOfFactorial(int input) {
		// TODO Auto-generated method stub
		float sum = 0;
		for (int i = 1; i <= input; i++) {
			sum = sum + (i / factorial(i));
		}
		System.out.println("Factorial of " + input + "is " + sum);

	}

	private static float factorial(int n) {
		int factorialOfNumber = 1;
		for (int i = 1; i <= n; i++) {
			factorialOfNumber *= i;

		}
		return factorialOfNumber;

	}

}
