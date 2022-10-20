package chapter3_selections;

import java.util.Scanner;

//Purpose: Calculate the shipping cost based on the weight:
//        (0,2]   --> 2.5
//        (2,4]   --> 4.5
//        (4,10]  --> 7.5
//        (10,20] --> 10.5
//        (20, )  -->  "The package can't be shipped"
public class ComputeShipCost {

	public static void main(String[] args) {
		//1. Get weight of package from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your weight in pound(s):");
		double weight = input.nextDouble();
		
		//2. Match the cost and show it
		//      (,0)    --> "Incorrect Weight"
		//      (0,2]   --> 2.5
		//      (2,4]   --> 4.5
		//      (4,10]  --> 7.5
		//      (10,20] --> 10.5
		//      (20, )  -->  "The package can't be shipped"
		if(weight<=0) {
			System.out.println("Incorrect Weight");
		}
//		else if(0<weight && weight<=2) {
		else if(weight<=2) {//weight<=0 --> False --->  weight >0
			System.out.println("The cost is 2.5");
		}
//		else if(2<weight && weight<=4) {
		else if(weight<=4) {//Hidden Cond.: weight >2
			System.out.println("The cost is 4.5");
		}
//		else if(4<weight && weight<=10) {
		else if(weight<=10) {//Hidden Cond.: weight >4
			System.out.println("The cost is 7.5");
		}
//		else if(10<weight && weight<=20) {
		else if(weight<=20) {//Hidden Cond.: weight >10
			System.out.println("The cost is 10.5");
		}
		else {//? What's the actual condition for
			  // the else part? What might be the 
			  // values look like if they "satisfy" 
			  //  the else?
			  // A.>20    
			  // B.>20 or <=0 
			System.out.println("The package can't be shipped");
		}
	}
	

}
