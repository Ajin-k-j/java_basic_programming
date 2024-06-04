package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3=2;
		if (num1>num2 && num1>num3) {
			System.out.println(num1);
			if (num2>num3) {
				System.out.println(num2);
				System.out.println(num3);
			}
			else {
				System.out.println(num3);
				System.out.println(num2);
			}
		}
		else if(num2>num1 && num2>num3) {
			System.out.println(num2);
			if (num1>num3) {
				System.out.println(num1);
				System.out.println(num3);
			}
			else {
				System.out.println(num3);
				System.out.println(num1);
			}
		}
		else {
			System.out.println(num3);
			if (num2>num1) {
				System.out.println(num2);
				System.out.println(num1);
			}
			else {
				System.out.println(num1);
				System.out.println(num2);
			}
		}
	}

}
