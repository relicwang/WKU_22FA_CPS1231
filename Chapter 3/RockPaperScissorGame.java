package chapter3_selections;

import java.util.Scanner;

//Purpose: Design a Rock Paper Scissor Game,
//			which will a generate a random actions from computer
//			After user enters their action, the program
//			will check the winner status (==who wins, win, lose, draw).
//				Specifically for actions:
//				0  represents  scissor
//				1  represents  rock
//				2  represents  paper

public class RockPaperScissorGame {

	public static void main(String[] args) {
		// 1. Generate a random computer action
		// == a random int in [0,2]
		int computerAct = (int) (Math.random() * 3);

		// 2. Get the user action
		Scanner input = new Scanner(System.in);
		System.out.println("Scissor(0), Rock(1), Paper(2):");

		int userAct = input.nextInt();

		// 3. Judge the winning status
		System.out.print("Computer action is: ");
		getAction(computerAct);
//		switch(computerAct) {
//			case 0:System.out.print("Scissor. ");break;
//			case 1:System.out.print("Rock. ");break;
//			case 2:System.out.print("Paper. " );break;
//		}
//		
		System.out.print("User actions is: ");
		getAction(userAct);
//		switch(userAct) {
//			case 0:System.out.print("Scissor. ");break;
//			case 1:System.out.print("Rock. ");break;
//			case 2:System.out.print("Paper. ");break;
//		}
//		
		switch (computerAct - userAct) {
		// PC wins
		case -2:
		case 1:
			System.out.println("Computer Wins");
			break;

		// Draws:
		case 0:
			System.out.println("Draws");
			break;

		// User wins:
		case 2:
		case -1:
			System.out.println("User Wins");
			break;

		// Incorrect user action
		default:
			System.out.println("Your action is invalid");
		}

	}

	// Signature: getAction: int --> print
	// Purpose: Convert the given action index to action name
	// Example: getAction(0) --> "Scissor"
	// getAction(1) --> "Rock
	public static void getAction(int actIndex) {
		switch (actIndex) {
		case 0:
			System.out.print("Scissor. ");
			break;
		case 1:
			System.out.print("Rock. ");
			break;
		case 2:
			System.out.print("Paper. ");
			break;
		}
	}

}
