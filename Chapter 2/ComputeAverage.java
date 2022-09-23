package chapter2_basic;

import java.util.Scanner;

//Purpose: Compute the average of three numbers
//          given by user.
public class ComputeAverage {

	public static void main(String[] args) {
		//1. Get 3 numbers from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers:");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();

		
		
//		System.out.println("The first entered number is "
//				+ num1);
//		System.out.println("The second entered number is "
//				+ num2);
//		System.out.println("The third entered number is "
//				+ num3);
		
		//2. Compute the average
//		double average = (num1+num2+num3)/3;

		
		//3. Show the average
		System.out.println("The average for "+num1+" , "
				+num2+" , "+num3+" is "+  (num1+num2+num3)/3);
	}

}
