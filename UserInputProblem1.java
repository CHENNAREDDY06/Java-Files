package com.javaArrays;
import java.util.Scanner;


public class UserInputProblem1 {
	public static void main(String[] args) {
		UserInput();
		
		System.out.println("Do not enter negative numbers, please run the program again");
		

}
	public static int UserInput() {
		Scanner input=new Scanner(System.in);
		int a=0;
			while(a>=0) {
				System.out.println("enter any number");
				a=input.nextInt();
			
			
		}
			return a;
		
	}
}
