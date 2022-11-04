package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: The program will seperate and print the first name 
//             and last name from the full name given by user.
//         
public class ObtainFirstAndLastName {
	public static void main(String[] args) {
		//1.  Get full name from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a name (Please user space to seperate first and last name:");
		String fullName = input.nextLine();
		
		//2.  Get the index of the space
		int spaceIndex  = fullName.indexOf(' ');
		
		//3.  Seperate the first and last names
		//  a. Take first name
	    String firstName = fullName.substring(0,spaceIndex);
		//  b. Take first name
	    String lastName = fullName.substring(spaceIndex+1);
	    
		//4.  Print the first and last names
		System.out.println("The first name is : "+firstName+", The last name is: "+lastName);
		
		
	}
}
