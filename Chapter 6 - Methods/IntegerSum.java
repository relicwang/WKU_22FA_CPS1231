package chapter6_method;

//Purpose: Compute sum of integers from 1 to 10
public class IntegerSum {

	public static void main(String[] args) {
		
		/**Brain Storm**/
		// Compute sum of integers from 1 to 10
//		int sum = 0;
//		for (int num = 1; num <= 10; num++) {
//			sum = sum + num;
//		}
//		System.out.println("Sum of integers from 1 to 10 is " + sum);

		// Compute sum of integers from 20 to 30
//		sum = 0;
//		for (int num = 20; num <= 30; num++) {
//			sum = sum + num;
//		}
//		System.out.println("Sum of integers from 20 to 30 is " + sum);

		

		
		// Compute sum of integers from 35 to 45
//		sum = 0;
//		for (int num = 35; num <= 45; num++) {
//			sum = sum + num;
//		}
//		System.out.println("Sum of integers from 35 to 45 is " + sum);
		

		/**Using Method**/
		int sum = sum(1,10);
		System.out.println("Sum of integers from 1 to 10 is " + sum);
		
		sum=sum(20,30);
		System.out.println("Sum of integers from 20 to 30 is " + sum);
		
		sum=sum(35,45);
		System.out.println("Sum of integers from 35 to 45 is " + sum);

		
		
		
		
	}
	
	//Design Recipe for the method:
	
	//Signature:  sum: int int --> int
	//Purpose:  Compute the sum of the integers from
	//           given begin value till the end value,
	//            and return the sum.
	//Examples:  sum(1,3)-->6
	///          sum(1,10) ---> 55
	
	//Header:  public static [RETURN TYPE] [NAME] [INPUT TYPES]
	public static int sum(int begVal, int endVal) {
		//Body --> achieve the purpose
		int sum = 0;
		for(int num=begVal;num<=endVal;num++) {
			sum+=num;
		}
	
		return sum;
	}

}
