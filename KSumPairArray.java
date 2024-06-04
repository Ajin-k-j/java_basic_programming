package com.ilpbatch4.utility;

public class KSumPairArray {

	public static void main(String[] args) {
		int array[] = {4,3,6,8,9,2,1};
		int k =5;
		
		kPairSum(array, k);
	}

	private static void kPairSum(int[] array, int k) {
		int count=0;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i]+array[j]==k)
				{
					count++;
				}
			}
		}
		System.out.println("number of pairs of elements in the array whose sum is equal to K is: "
				+ count);		
	}

}
