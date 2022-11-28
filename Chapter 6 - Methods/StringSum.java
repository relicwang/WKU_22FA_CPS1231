package chapter6_method;

public class StringSum {

	public static void main(String[] args) {
		System.out.println(countSum("abc1a2"));
		
	}
	
	public static int countSum(String orgText) {
		int sum=0;
		for(int i=0;i<orgText.length();i++) {
			char curChar=orgText.charAt(i);
			
			if(Character.isDigit(curChar)){
				sum+=Character.getNumericValue(curChar);
			}
		}
		
		return sum;
	}

}
