package chapter5_loops;

//Purpose: Print the multiplication table
public class MultiTable {

	public static void main(String[] args) {
		
		
		//Brainstorm: How to print one row seperately
		// Print 3rd row
//		for(int colNum=1;colNum<10;colNum++) {
//			System.out.print(3*i+" ");
//		}
//		
//		
//		// Print 4th row
//		for(int i=1;i<10;i++) {
//			System.out.print(4*i+" ");
//		}
		
		
		//Generate different row numbers one per each iteration
		for(int rowNum=1;rowNum<10;rowNum++) {
			//Print one row of multi-table based on the given row index
			for(int colNum=1;colNum<10;colNum++) {
				System.out.printf("%-3d",rowNum*colNum);
			}	
			System.out.println();
		}
		
		

	}

}
