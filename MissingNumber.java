package com.ilpbatch4.utility;

public class MissingNumber {

	public static void main(String[] args) {
		int limit=10;
		int array[]= {1,2,4,7,8,9};
		for(int i=-limit;i<=limit;i++) {
			int temp=0;
			for(int j=0;j<array.length;j++) {
				if(array[j]==i) {
					temp=1;
				}
			}
			if(temp==0) {
				System.out.println(i);
			}
		}

	}

}
