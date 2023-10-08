package com.javaArrays;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Hi");
		int Year=input.nextInt();
		if(Year%4==0) {
			if(Year%100==0) {
				if(Year%400==0) {
					System.out.println("It's a leap year");
					
				}
				else {
				System.out.println("It's a leap year");
				}
				
				
			}
			System.out.println("it's a leap year");
		}
		
		
		else {
			System.out.println("It's not a leap year");
	}
		
		
	}

}
