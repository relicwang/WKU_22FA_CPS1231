package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: Test different string methods
//        String: a collection of character (1, or many)
public class PlayWithString {

	public static void main(String[] args) {

		String message = "     Welcome to WKU      " ;
		String anotherStr = "a";
		
		
		//1. Check the length 
//		System.out.println("The lenth of String message : "
//								+message.length());
//		System.out.println("The lenth of String anotherStr : "
//				+anotherStr.length());
//		
		
		//2. Take out nth character
		//String message = "Welcome to WKU";
		char thirdChar=   message.charAt(6);
//		System.out.println(thirdChar);
		
		
		//3. Combine 2 String.
		String combinedString = message.concat(anotherStr);
//		System.out.println(combinedString);
		
		//4. Romove the leading and tailing spaces
		//   == space in both sides/ends
		//String message = "     Welcome to WKU      " ;
		String messageNoSpace = message.trim();
		
//		System.out.println("Before removing the space: "+message);
//	
//		System.out.println("After removing the space: "+messageNoSpace);

		
		//6. Get the 1st and last character from 
		//    a String given by user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a String:");
		String newMessage = input.next();
		
		// a. Get the 1st character
		
		char firstChar = newMessage.charAt(0);
		
		// b. Get the last character
		char lastChar = newMessage.charAt(newMessage.length()-1);

		
		
	}

}
