package chapter3_selections;

import java.util.Scanner;


//Purpose: Convert the score entered by user to a 
//           letter grade.
public class ConvertGrade {

	public static void main(String[] args) {
		//1. Get the score from the user
		Scanner input = new Scanner(System.in);
		System.out.println("Plese enter a score:");
		double score = input.nextDouble();
		
		//2. Convert the score to letter grade
		//    [90,100]->'A'
		//    [80,90] ->'B'
		//    [70,80] ->'C'
		//    [60,70] ->'D'
		//    [0,60]  ->'F'
		
		String letterGrade="F";
		if(score>=90) {
			letterGrade="A";
		}
		else if(score>=80 ) {//--> score<90 AND score>=80
			letterGrade="B";
		}
		else if(score>=70) {//if we can get here
			                  // --> hidden condition:
			                  // score <80
			letterGrade="C";
		}
		else if(score>=60) { //hiddent condition:
			                 //score<70
			letterGrade="D";
		}
		//Optional
		else {//==score<60
			letterGrade="F";
		}
		
		
		//3. Print the letter grade
		System.out.println("The corresponding grade for "
				+ "score : "+score+ " is "+letterGrade+ ".");
		
	}

}
