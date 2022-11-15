package chapter4_MathFuc;

import java.util.Scanner;

//Purpose: Defang the IP address via surrounding the 
//           point(.) with square brackets ([ ])
public class DefangIP {

	public static void main(String[] args) {
		//1. Get the IP address from user
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a IPV4 address:");
		String ipAddress = input.nextLine();
		
		//2. Find the index of 3 points
		int point1Index = ipAddress.indexOf('.');
		int point2Index = ipAddress.indexOf('.',point1Index+1);
//		int point3Index = ipAddress.indexOf('.',point2Index+1);
		int point3Index = ipAddress.lastIndexOf('.');

		
//		System.out.println(point1Index);
//		System.out.println(point2Index);
//		System.out.println(point3Index);
		
		//3. Take out the substring(which are groups
		//    of numbers)
		String substring1 = ipAddress.substring(0,point1Index);
		String substring2 = ipAddress.substring(point1Index+1,point2Index);
		String substring3 = ipAddress.substring(point2Index+1,point3Index);
		String substring4 = ipAddress.substring(point3Index+1);
		
		//4. Defang out IP address 
		String defangedIP = substring1 +"[.]"+substring2 +"[.]"+substring3 +"[.]"+substring4;

		System.out.println("The defanged IP adress is:" );
		System.out.println(defangedIP);
		
	}

}
