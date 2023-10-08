package com.javaArrays;

public class RotationCount extends Binarysearch {
	
	public static void main(String[] args) {
	 int [] ary= {6,7,8,0,1,2,3,5};
 System.out.println( search(ary,3));
		
		}
		

public static int search(int[] arr, int target) {
	
	//System.out.println(findPivot(arr));
	int pivot=findPivot(arr);
	
	if (pivot==-1) {
		return Bsearch(arr, target, 0, arr.length-1 ); 
	
}
if(arr[pivot]==target) {
	return pivot;
}
 if(target>=arr[0]) {
	 return Bsearch(arr, target, 0, pivot-1);
	 
 }
 return Bsearch(arr, target, pivot+1, arr.length-1);
}

	
	public static int findPivot(int[] a) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end&&a[mid]>a[mid+1]) {
				return mid;
					
				}
			if(mid>start&&a[mid]<a[mid-1]) {
				return mid-1;
			}
			if(a[start]>a[mid]) { 
				end=mid-1;
			}
			else{
				start=mid+1;
				
			}
			return mid;
			}
		return -1;
		}
		
	}


