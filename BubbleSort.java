package com.javaArrays;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		
		System.out.println(bubbleSort(arr));
		
		
	}
	static boolean bubbleSort(int[] a) {
		boolean swapped=false;
		
		for(int i=0;i<=a.length-1;i++) {
			for (int j=0;j<=a.length-1-i-1;j++) {
				
				if(a[j] >a[j+1]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				swapped=true;
					
					
				}
				
			}
			return swapped;
		}
		
		
		return swapped;
		
	}
	

}
