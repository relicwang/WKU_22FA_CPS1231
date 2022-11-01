package chapter4_MathFuc;

//Purpose: Generate a random password, which contains
//		•  3 lowercase letters
//		•  2 uppercase letters
//		•  6 single-digit numbers

public class GenerateRandomPassword {

	public static void main(String[] args) {
		//0. Define a variable that holds the entire 
		//  password
		String randPasswod ="";
		
		//1. Define base characters
		char baseLowerChar ='a';
		char baseUpperChar ='A';
		char baseDigitChar ='0';

		
		//2. Generate corresponding random characters
		// a. 3 random lowercase letters
		for(int i=0;i<3;i++) {
			randPasswod+=(char)(baseLowerChar+(int)(Math.random()*26));
		}
		
//		char randLower1 = (char)(baseLowerChar+(int)(Math.random()*26));
//		char randLower2 = (char)(baseLowerChar+(int)(Math.random()*26));
//		char randLower3 = (char)(baseLowerChar+(int)(Math.random()*26));

		// b. 2 random uppercase letters
		
		for(int i=0;i<2;i++) {
			randPasswod+=(char)(baseUpperChar+(int)(Math.random()*26));
		}
		
//		char randUpper1 = (char)(baseUpperChar+(int)(Math.random()*26));
//		char randUpper2 = (char)(baseUpperChar+(int)(Math.random()*26));

		
		// c. 6 random single digits
		
		//Loop approach
		//1. For loop
		
		for(int i=0;i<6;i++) {
			randPasswod+=
					(char)(baseDigitChar+(int)(Math.random()*10));
//			System.out.println((char)(baseDigitChar+(int)(Math.random()*10)));
		}
		
		
		
		
//		char randDigit1 = (char)(baseDigitChar+(int)(Math.random()*10));
//		char randDigit2 = (char)(baseDigitChar+(int)(Math.random()*10));
//		char randDigit3 = (char)(baseDigitChar+(int)(Math.random()*10));
//		char randDigit4 = (char)(baseDigitChar+(int)(Math.random()*10));
//		char randDigit5 = (char)(baseDigitChar+(int)(Math.random()*10));
//		char randDigit6 = (char)(baseDigitChar+(int)(Math.random()*10));

		
		//3. Combine these random characters and print the password
//		System.out.println(""+randLower1+randLower2+randLower3+randUpper1
//				+randUpper2+randDigit1+randDigit2+randDigit3+
//				randDigit4+randDigit5+randDigit6);
		//abcAG124453
		System.out.println(randPasswod);
		
	}

}
