package com.javaArrays;

import java.util.Arrays;

public class SimpleSearchInArray {
	public static void main(String[] args) {
		int a[]= {23,5,1,5,6,3,7};
	/*int result[]=Search(a,5);
	for(int k : result) {
		System.out.print(k+" ");
	}*/
		System.out.println(Arrays.toString(Search(a,5)));
	
		
	}
	static int[] Search(int b[], int targetElement) {
		
		for (int i=0;i<=b.length-1;i++) {
			if(b[i]==targetElement)
			{
				int d[]={i};
				for(int j=i+1;j<b.length-1;j++) {
					if(b[j]==targetElement) {
						 int c[]={i,j};
						return c;
						
						
						};
					}
				return d;
				}
			
			   
			
		}
		
		
	
		return new int[] {-1};
	}
}



