package chapter5_loops;

import java.util.Scanner;

//Purpose: We will generate a random integer in [0,100]
//          and user will guess a number. The program
//          will show the corresponding hints (too high, 
//          too low, correct). We will continue ask 
//          user to enter their guess until the correct guess is given.

public class GuessNumberDoWhileLoop {
	public static void main(String[] args) {
		//1. Generate a random integer in [0,100]
		int key = (int)(Math.random()*101);
		System.out.println(key);
		
		//2. Ask user to guess the number
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 to 100 ");
//		System.out.println("Enter your guess: ");
//		
//		int guess = input.nextInt();

		int guess =-1;
		
		do{
			System.out.println("Enter your guess: ");
			 guess = input.nextInt();
		
			//3. Check the user number and the key, and show the hint
			if(guess<key) {
				System.out.println("Too low");
			}
			else if (guess>key) {
				System.out.println("Too high");
			}

		}while(guess!=key);
			
		
	
		System.out.println("Awesome, the value you entered is Matched!");
	
		
	}

}
