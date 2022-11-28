package chapter6_method;

//Purpose: Design our own min max method
public class CustomizedMinMax {

	public static void main(String[] args) {
		System.out.println(min(1,2));//1.0
		System.out.println(min(-54.6,5555));//-54.6
	
	
	}
	
	
	//Signature: min: double double  --> double
	//Purpose:   Compare two given double numbers
	//            and return the one that is smaller
	//Example:
	//           min(1,2) --> 1.0
	//           min(22,1)--> 1.0
    //           min(-54.6,5555)---> -54.6	
	public static double min(double num1, double num2) {
		if(num1<num2) {
			return num1;
		}
//		else {
			return num2;
//		}
		
		
	}

}
