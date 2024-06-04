package com.ilpbatch4.utility;

public class SortArrayZeroOne {

	public static void main(String[] args) {
		int array[] = {1,0,0,0,2,1,0,1};
		
		sortArray(array);

	}
//sorting in descending order
	private static void sortArray(int[] array) {
		int temp;
		for(int i=0; i<array.length; i++)
		{
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[i])
				{
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println("Sorted Array is: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

}
