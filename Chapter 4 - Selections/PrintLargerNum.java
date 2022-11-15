package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: Show the larger number among
//             the two double numbers given
//              by user.
public class PrintLargerNum {

	public static void main(String[] args) {
		//1. Get 2 numbers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers : ");
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		//2. Do the comparsion (Math.max) 
		//   and show the result
		System.out.println("The larger number is "+
							Math.max(num1, num2));
		
		
		
	}

}
