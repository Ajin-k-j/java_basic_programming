package com.ilpbatch4.utility;

public class SubArraySumS {

	public static void main(String[] args) {

		int[] A = {3, 8, 5, 7, 6, 9, 3, 2};
		int S = 15;
		SubArraySumsS(A, S);

	}

	private static void SubArraySumsS(int[] array, int s) {
		boolean found=false;
		
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			for(int j=i;j<array.length;j++) {
				sum += array[j];
//				System.out.println("sum: " + sum);
				if (sum == s) {
					found=true;
					System.out.println("Left index:" + i+", Right index:"+j);
					break;
				} else if(sum>s){
					break;
				}
			}
		}
		if(!found) {
			System.out.println("No subarray found");
		}
	}

}
