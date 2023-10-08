package com.javaArrays;

import java.util.Arrays;

public class SelectionSorting {
public static void main(String[] args) {
	int d[]= {4,5,1,2,3};
	selectionSort(d);
	System.out.println(Arrays.toString(d));
	//Slection sorting is simple placing the maximum or minimum element in its place by sorting 

}



public static void selectionSort(int b[]){
	for (int i=0;i<b.length;i++) {
		int lastElement=b.length-1-i;
		int max=LargestInArray(b,lastElement);
		swap(b,max,lastElement);
	
	}
	

}
	public static void swap(int arr[],int max, int LastElement ) {
		int temp=arr[LastElement];
		arr[LastElement]=arr[max];
		arr[max]=temp;
		
		
	}
		

public static int LargestInArray(int a[],int LastElement) {
	int Max=0;
	for(int i=0;i<=LastElement;i++) {
		if(a[Max]<a[i]) {
			Max=i;
		}
			
		}
	return Max;
	}
}
		
	


