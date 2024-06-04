package com.ilpbatch4.utility;

public class AscendingAndDescendingOrder {

    public static void main(String[] args) {
        int array[] = {8,4,2,5};
        System.out.println("Array in ascending order:");
        printArrayInAscendingOrder(array);
    }

    private static void printArrayInAscendingOrder(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            int smallestIndex = smallestIndexOfArray(array);
            System.out.println(array[smallestIndex]);
            array[smallestIndex] = largestOfArray(array);
        }
    }

    private static int largestOfArray(int[] array) {
    	int largest=0;
		for(int i=0;i<array.length;i++) {
			if (array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;

	}

	private static int smallestIndexOfArray(int[] array) {
        int smallestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[smallestIndex]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
