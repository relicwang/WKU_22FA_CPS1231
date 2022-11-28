package chapter6_method;

//purpose: Print the multi. table using method
public class MultiTableMethodWay {

	public static void main(String[] args) {
		//Test 
//		printRow(1);
//		printRow(2);
//		printRow(9);
		
		//Use our method:
		for(int rowNum=1;rowNum<=9;rowNum++) {
			printRow(rowNum);
			
			
		}
		
	}
	
	
	//Signature:  printRow: int ---> void
	//Purpose:  Print the corresponding row of the 
	//          mult. table based the given row number.
	//Examples:     printRow(1)---> print 1, 2, 3, 4, ... , 9 
	//              printRow(2)---> print 2, 4, 6, 8, ... , 18 
	//              printRow(9)---> print 9, 18, 27, ....., 81
	public static void printRow(int rowNum) {
		for(int colNum=1;colNum<=9;colNum++) {
			System.out.printf("%3d",rowNum*colNum);
		}
		System.out.println();
	}
}
