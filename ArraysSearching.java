package com.javaArrays;
import java.util.Arrays;

public class ArraysSearching {
	
public static void main(String[] args) {
	int[] a= {10,3,14,27,1};
	System.out.println(exists(a,100));
	String MyName="Venkat";
	 CharSearch(MyName, 't');
	char[] c=MyName.toCharArray();
	
		
	System.out.println(Arrays.toString(c));
	System.out.println(MinInArray(a,23));
	int[] SortedArray=ArraySort(a);
	for(int g: SortedArray) {
		System.out.println(g);
	}
	
	
	
}
static int exists(int[] b, int c) {
	for(int i=0;i<b.length;i++) {
	if(b[i]==c) {
		System.out.println("The number exists at index");
		
		return i;
	}
	
	
	}
	return Integer.MIN_VALUE;
			}
static void CharSearch(String str, char SearchElement) {
	char[] s=str.toCharArray();
	for(char z:s) {
		if(z==SearchElement) {
			System.out.println("The char exists:");
			
		}
		
	}
	
	
}
static int MinInArray(int[] a,int min) {
	
	for(int i=0;i<a.length;i++) {
	if(a[i]<min) {
		min=a[i];
	}
	
	}
	return min;
	
}
static int[] ArraySort(int[] v) {
	int temp;
	for(int a=0;a<v.length;a++) {
		for(int j=a+1;j<v.length;j++) {
			if(v[a]<v[j]) {
				temp=v[a];
				v[a]=v[j];
				v[j]=temp;
			}
		}
		
	}
	return v;
}

}



	
	


