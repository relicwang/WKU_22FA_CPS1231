package chapter3_selections;

//Purpose: Test with random number.
//          Math.pow(2,3) --> 2 to power of 3
//          Math.random() --> a random double number
//                             in the range [0,1)
public class TestRandomNum {

	public static void main(String[] args) {
		
//		double randNum = Math.random();
//		System.out.println(randNum);
		
//		System.out.println(Math.random());
		
		
		
		//Given:Math.random() --> a double value in [0,1)
		
		//Q1: We want to generate a double value in [0,10)
		//   How to use Math.random() to achieve it?    
//		System.out.println(Math.random()*10);
	
		
		//Q2: We want to generate a double value in [0,25)
		//   How to use Math.random() to achieve it? 
		// --> Math.random() --> [0,1)
		//    --> Math.random()*25  --> [0,25)
//		System.out.println(Math.random()*25);

		//Q3: We want to generate a double value in [2,30)
		//   How to use Math.random(): [0,1) to achieve it? 
		//   Math.random() --> [0,1)
		//     ---> Math.random()+2 --> [2,3) --> *10 --> [20,30)
		
		//   Math.random()*28+2 ---> [0,1)*28-->[0,28)+2 ->[2,30)
		
		//Q4: We want to generate a double value in [6,87)
		//	Formula: Math.random()*Magnitude + offset
		// Math.random()*81 + 6 -->
		// [0,1)*81+6 --> [0,81)+6--> [6,87)
		
		
		
		//Q1: We want to generate a double value in [0,10)
		//   How to use Math.random() to achieve it?    
//		System.out.println(Math.random()*10)

		//--> I only want to get int. part
		//     convert the double value to a integer
		//      where the fraction part will be removed.
		double num1 = 3.9;  
		int num2 = (int)num1;
		
//		System.out.println("Orignal num1: "+num1);
//		System.out.println("After convert to int.: "+num2);

		//A random integer value either 0/1
		// ==  a random int. in [0,1]
		
		int randInt = (int)(Math.random()+0.5);
		//Common pitfall:
		int randInt2 = (int)Math.random()*2;

		System.out.println(randInt);
		
		
		
		//Summary: We want to generate a random double value in
		//         the range [min,max), to use Math.random():
		//Formula will be:  Math.random()*(max-min) + min
		
		
		
		
		
		
		
		//Summary: We want to generate a random integer value in
		//         the range [min,max],  to use Math.random():
	}

}
