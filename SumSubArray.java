package com.ilpbatch4.utility;

public class SumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,1,3,2,4,1};
		int s=5;
		subArray(a,s);
	}

	private static void subArray(int[] a, int s) {
		// TODO Auto-generated method stub
		int startIndex=0;
		int endIndex=0;
		int subArrayCount=0;
		for(int i=0;i<a.length;i++) {
			int sDuplicate=s;
			int iteration=0;
			for (int j=i;j<a.length;j++) {
				sDuplicate-=a[j];
				iteration++;
				if ((sDuplicate==0) && (iteration>1)){
					System.out.println("Sub array which adds to " + s + " is present");
					subArrayCount=1;
					endIndex=j;
					break;
				}
				else if(sDuplicate<0) {
					break;
				}
			}
			if (subArrayCount==1) {
				startIndex=i;
				System.out.println("Start index: " + startIndex + "End index: " + endIndex);
				subArrayCount=0;
			}
		}
	}

}
