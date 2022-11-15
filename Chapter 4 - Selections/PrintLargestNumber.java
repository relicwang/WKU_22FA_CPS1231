package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: Print the largest number among
//           5 numbers given by user.
public class PrintLargestNumber {

	public static void main(String[] args) {
		//1. Get 5 numbers 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter five numbers : ");
	
		System.out.println(
				Math.max(Math.max(Math.max(Math.max(input.nextDouble(), input.nextDouble()),input.nextDouble()),input.nextDouble()), input.nextDouble())	
		);
		
		
//		double num1 = input.nextDouble();
//		double num2 = input.nextDouble();
//		double num3 = input.nextDouble();
//		double num4 = input.nextDouble();
//		double num5 = input.nextDouble();
//	
//		//2. Compare 5 number and show the largest
//		//   one
//		
//		double maxNum=	Math.max(Math.max(Math.max(Math.max(num1, num2),num3),num4), num5);		
//		System.out.println("The largest number is "+maxNum);
	}

}
