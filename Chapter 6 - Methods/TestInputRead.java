package chapter6_method;

import java.util.Scanner;

//Purpose: Read a integer first then a String
public class TestInputRead {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//1. Read an integer
		System.out.println("Please eneter an integer: ");
		int number = input.nextInt();//Only read the number, before the return key character
		
		//2. Read a String
		System.out.println("Please eneter a String: ");
		String text = input.nextLine();//Read the return key character
		
		

		//3. Print out text and string
		System.out.println("The entered number is "+ number);
		System.out.println("The entered String is "+ text);

	}

}
