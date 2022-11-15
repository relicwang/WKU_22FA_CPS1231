package chapter4_MathFuc;


//Purpose: Generate a lowercase letter character randomly
public class GenerateLowercaseLetter {

	public static void main(String[] args) {
		//1. Define the base character
		char baseChar = 'a';
		
		
//		for(int i=0;i<100;i++) {//Loop 100 times
			//2. Generate a random integer in [0,25]
			int randOffset = (int)(Math.random()*26);
			
			
			//3. Obtain the random lowercase letter character
			char randLowerChar=(char)(baseChar+randOffset);
			System.out.println(randLowerChar);
			
//		}
	}

}
