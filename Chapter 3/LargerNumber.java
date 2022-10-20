package chapter3_selections;

import java.util.Scanner;

//Purpose: Compare two integer number from user
//           and show the larger one.
public class LargerNumber {

	public static void main(String[] args) {
		//1. Get two integer numbers from user
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter 2 numbers:");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		
		//2. Compare two numbers and show the larger one
		if(num1>num2) {
			System.out.println("Number 1:  "+num1 +" is larger");
		}
		else {
			System.out.println("Number 2:  "+num2 +" is larger");
		}
		
		
	}

}
