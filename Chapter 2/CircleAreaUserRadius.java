package chapter2;

import java.util.Scanner;//Library == give a book to complier for reference

//Purpose: Compute the area of a circle
//          where the radius is given by user.
public class CircleAreaUserRadius {

	public static void main(String[] args) {
		//1. Define PI
		double pi = 3.14159;
	
		//2. Get the radius from user
		System.out.println("Please enter 2 radius for the circle:");
		
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
//		double radius2 = input.nextDouble(); 
//		
//		System.out.println("radius1 is "+ radius1);
//		System.out.println("radius2 is "+ radius2);

		//3. Compute the area
		double area = pi*radius*radius;
//		
//		//4. Show the area
//		//  TODO: revise the raidus 10 to actual radius
		System.out.println("The area for the circle"
				+ " with radius " +  radius  +" is "+ area);
		
		
		
	}

}
