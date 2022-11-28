package chapter6_method;

//Purpose: 
public class TemperatureConversion {

	public static void main(String[] args) {
//		System.out.println(9.8*9/5+32);
//		System.out.println(100.0*9/5+32);
//		System.out.println(-25.0*9/5+32);
		c2f(9.8);
		c2f(100);
		c2f(-25);
		
		c2f(-300);
	}
	
	
	
	
	//Signature: c2f: double --> void
	//Purpose:   Covert the given celicus temp. to Farh. temp.
	//            and directly print the result.
	//         	 When the cel. temp lower than -273.15, 
    //             print "Invalid Temperature" and not
	//           proceed to the temperature conversion.
	//Examples:  c2f(9.8)-->print: 49.64
	//           c2f(100)-->print: 212.0
	//           c2f(-25)-->print: -13.0
	public static void c2f(double celTemp) {
		if(celTemp<-273.15) {
			System.out.println("Invalid Temperature"); 
			
			return;
		}
		System.out.println(celTemp*9/5+32);      
	}

	

}
