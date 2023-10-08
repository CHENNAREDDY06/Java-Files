package com.javaArrays;

public class Binarysearch {
	public static void main(String[] args) {

		int[] a= {2,4,5,6,11,14,15,16};
		
		
		
	}
	static int Bsearch(int[] a, int target, int start, int end ) {
		
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			if(target<a[mid]) {
				end=mid-1;
				
			}
			else if(target>a[mid]) {
				start=mid+1;
				
			}
			else  {
				return mid;
			}
			
		}
		return 0;
		
		
		
	}
}
