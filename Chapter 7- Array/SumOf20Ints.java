package chapter7_array;

import java.util.Scanner;

//Purpose: Compute the sum of 20 integers 
//           given by user
public class SumOf20Ints {
	public static void main(String[] args) {
		//1. Get 20 integers from user
		//     and save to a integer array
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter 20 integers:");
		
		int[] nums = new int[20];
		
		for(int i=0;i<nums.length;i++) {
			nums[i]=input.nextInt();
		}
		
		//2. Compute the sum of all elements 
		int sum =0;
		
		for(int i=0;i<nums.length;i++) {
			sum=nums[i]+sum;
		}
		
		//3. Print out the sum
		System.out.println(sum);
	}
}
