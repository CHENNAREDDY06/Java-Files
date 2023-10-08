package com.javaArrays;

public class OrderAgnosticsBS {
	
 public static void main(String[] args) {
	 int array[]= {1,3,4,5};
	
	System.out.println( search(array,2));
}
static int search(int a[], int target) {
	
	int start = 0;
	int end=a.length-1;
	boolean IsAsc=a[start]<a[end];
	while(start<=end) {
		int mid=(start+end)/2;
		if(target==a[mid]){
			return mid;
		}
		if(IsAsc) {
		  if(target<a[mid]) {
			end=mid-1;
			
		
		  }
		   else {
			start=mid+1;
			
		   }
		
		}
		else {
			if(target>a[mid]) {
				end=mid-1;
				
			}
			else {
				start=mid+1;
			}
			
			
		}
	
	
}
	return a[start];
}
}

