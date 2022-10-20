package chapter3_selections;

import java.util.Scanner;

//Purpose:
//     Check the number given by user whether is even.
//     If even, show even number;
//     Otherwise, do nothing.
public class CheckEvenNumber {

	public static void main(String[] args) {
		//1. Get a number from user
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		
		int number = input.nextInt();
		
		//2. Check the number whether is even,
		//   if even, --> show "even number"
	    if(number%2==0) {
			System.out.println("Even number");
		}
		
	
	}

}
