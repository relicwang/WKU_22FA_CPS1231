package chapter6_method;


public class FindSign {

	public static void main(String[] args) {
		//Test cases
		//A comprehensive test cases are quite important.
		//You are required to come up the different grou[s
		// of test cases to prove your method is correctly
		// implemented.
		//1. Positive
	    System.out.println(sign(9999999)== 1);    
	    System.out.println(sign(1223123)== 1);    
	    System.out.println(sign(1)== 1);    
	    System.out.println(sign(135)== 1);    
	    System.out.println(sign(2)== 1);    
	    System.out.println(sign(55)== 1);    

		//2. Negative
	    System.out.println(sign(-1)== -1);    
	    System.out.println(sign(-222)== -1);    
	    System.out.println(sign(-898987)== -1);    
	    System.out.println(sign(-898988218)== -1);    

	    
	    
		
		//3. 0
	    System.out.println(sign(0)== 0);    

	}
	 
	//Signature:  sign： int   --->  int
	//Purpose: Design a method that will return 
	//          the sign of given integer, and return it
	//         Specifically,
	//          + --->1
	//          - --->-1
	//          0 --->0
	//Examples: 
	//           sign(1) -(return)--> 1
	//           sign(5)  ---->   1
	//           sign(-1) ---->  - 1
    //           sign(-888) ---->  - 1
   //            sign(0) ---->  0
	public static int sign(int num) {
		if(num>0) {
			return 1;
		}
		else if(num<0){//num<0
			return -1;
		}
		else {
			return 0;
		}
		
	}
	

}
