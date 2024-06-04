package com.ilpbatch4.utility;

public class DuplicateInArray {

	public static void main(String[] args) {
		int array[]= {1,1,2,3,3,3,3,3,4,4,5};
		duplicateInArray(array);
	}

	private static void duplicateInArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				if(array[i]==array[j] && i !=j) {
					System.out.println(array[i]);
				}
			}
		}
		
	}

}
