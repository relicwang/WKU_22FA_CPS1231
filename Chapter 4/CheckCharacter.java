package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: Check the given character is lowercase letter character
//             
public class CheckCharacter {

	public static void main(String[] args) {
		//1. Get a character from user
//		char ch = 't';
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a character:");
		String receivedString = input.next();//"W"
		
		char ch = receivedString.charAt(0);//"W" --> 'W'
		//2. Check whether the given character is lowercase letter
		//Appoarch 1: 
//		if('a'<=ch&&ch<='z') {
//			System.out.println("Character " + ch + " is  lowercase");
//		}
//		else {
//			System.out.println("Character " + ch + " is not  lowercase");
//		}
		
		//Appoarch 2:
		//a. Check lowercase letter
//		if(Character.isLowerCase(ch)) {
//			System.out.println("Character " + ch + " is  lowercase");
//		}
//		else {
//			System.out.println("Character " + ch + " is not  lowercase");
//		}
		
		//b. Check uppercase letter
//		if(Character.isUpperCase(ch)) {}
		
		//c. Check whether is a digit
//		if(Character.isDigit(ch)) {}
		
		//d. Check whether given character is letter or digit
		//   === We are happy with upper/lowercase letter+ digit
		if(('a'<=ch&&ch<='z')||('A'<=ch&&ch<='Z')  ||('0'<=ch&&ch<='9')) {
			System.out.println("Character " + ch + " is a letter/digit");
		}
		else {
			System.out.println("Character " + ch + " is NOT a letter/digit");
		}
		
		
		if(Character.isLetterOrDigit(ch)) {
			System.out.println("Character " + ch + " is a letter/digit");
		}
		else {
			System.out.println("Character " + ch + " is NOT a letter/digit");
		}
	}

}
