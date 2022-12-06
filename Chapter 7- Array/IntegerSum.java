package chapter7_array;

import java.util.Scanner;

//Purpose: Compute the sum of 40 integers 
//         given by user
public class IntegerSum {

	public static void main(String[] args) {
		//1. Get 8 integers from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 8 numbers: ");
;
		//Array approach
		//How to create an array? == Syntax of array creation
		//DATA_TYPE []   NAME = new DATA_TYPE[SIZE];
		int[] nums = new int[40];
		
		for(int i=0;i<nums.length;i++) {
			nums[i] = input.nextInt();
		}	
		
		//2. Compute  sum
		int sum=0;
		for(int i=0;i<nums.length;i++) {	
			sum=nums[i]+sum;
		}
		//3. Show sum
		System.out.println(sum);
		
	}

}
