package chapter7_array;

//Purpose: Compute the average of 100 random double
//         numbers in range [0,100)
public class RandNumAverage {

	public static void main(String[] args) {
		//1. Generate 100 random values in [0,100)
		//   and save to an array
		double[] randNums = new double[10000];
		
		for(int i=0;i<randNums.length;i++) {
			randNums[i]=Math.random()*100;
		}
		//2. Compute the sum of elements 
		double sum = 0;
		for(int i=0;i<randNums.length;i++) {
			sum=randNums[i]+sum;
		}
		
		//3. Compute and show the average
		System.out.println(sum/randNums.length);
		
	}

}
