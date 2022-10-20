package chapter3_selections;

//Purpose: Generate a random double value
//          in[0,10)
public class RandomNumber {

	public static void main(String[] args) {
		//Generate a random double value in[0,10)
		double randValue = Math.random()*10;
		
		System.out.println("A random value in [0,10) is "+ randValue);
		
	}

}
