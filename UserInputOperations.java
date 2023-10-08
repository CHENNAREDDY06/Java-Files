package com.javaArrays;
import java.lang.reflect.Array;
import java.util.Scanner;

public class UserInputOperations {
public static void main(String[] args) {
	int summation=Sum();
	System.out.println(Average(summation, 10));
}

public static int Sum() {
	Scanner input=new Scanner(System.in);
	int[] array1=new int[10];
	System.out.println("Enter 10 numbers:");
	for(int i=0; i<Array.getLength(array1);i++) {
		array1[i]=input.nextInt();
	}
	int sum=0;
	for (int j=0; j<Array.getLength(array1);j++) {
		sum=sum+array1[j];
		
	}
	return sum;
	
	
}
public static int Average(int summation, int size) {
	int Average=summation/size;
	return Average;
	
}
}
