package com.javaArrays;

public class InfiniteArray {
	
	
	public static void main(String[] args){
	int[] arr={3, 5, 7,9,10,90,100,130,140, 160, 170};
	int target=10;
	System.out.println(ans(arr,target));
	
	}
	static int ans(int[]a, int target) {
		int start=0;
		int end=1;
		while(target>a[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
			
		}
		
		return index(a,target, start, end );
		
	}
	
	static int index(int[]a, int target, int start, int end) {
		
		
		
		while(start<=end) {
	
	
			int mid=start+(end-start)/2;
			if(target>a[mid]) {
				start=mid+1;
				
			}
			else if(target<a[mid]) {
				end=mid-1;
			
			}
			else {
				return mid;
			}
			
			
		}
		return -1;
		
		
		
				
	}

}
