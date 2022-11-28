package chapter6_method;

//Purpose: Explore the format output
public class TestFormatOutpu {

	public static void main(String[] args) {
		int count = 5;
		double amount =999.3;
		
		int randInt =99;
		
		//1. Print "count is [count], amount is [amount]"
		//Old approach:
//		System.out.println("count is "+count+", amount is "+amount);
		
		//Format out approach：
		System.out.printf("count is%-3d, amount is %f. Another integer is %d",count, amount,randInt);
	}

}
