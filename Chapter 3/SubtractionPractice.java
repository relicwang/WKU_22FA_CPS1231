package chapter3_selections;

import java.util.Scanner;

//Purpose:
//        Create a program to generate a subtraction
//        practice question, which contains two single-digit
//        int. number randomly (where number1 >=number2).
//        The program should check the answer entered by user,
//        and show the corresponding result.
public class SubtractionPractice {

	public static void main(String[] args) {
		//1. Generate two random integers in [0,10)
		int number1= (int)(Math.random()*10);
		int number2= (int)(Math.random()*10);
		
		//2. Check if number1 >= number2? If not,
		//    we swap the value of number1 and number2
	
		//If #2 >#1, swap the #1 and #2
		if(number2>number1) {
			int temp = number1;
			number1=number2;
			number2=temp;

		}
		
		
		//3. Show user the subtraction question
		System.out.println("What is "+number1 +" - "+number2+"?");
		
		
		//4. Get user answer
		Scanner input =new Scanner(System.in);
		int userAnswer = input.nextInt();
		
		//5. Check user answer with the key
		int key = number1 -number2;
		
		if(userAnswer==key) {
			System.out.println("You are correct!");
		}
		else {
			System.out.println("Your answer is wrong.");
			
			System.out.println("The correct answer for "+number1 +" - "
									+number2+" is "+ key);
					
			
		}
		

	}

}
