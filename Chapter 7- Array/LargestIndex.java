package chapter7_array;

import java.util.Arrays;

//Purpose: Find the index of largest number in the 
///        given integer array.
public class LargestIndex {

	public static void main(String[] args) {
		/*
		 * //How to create an array? //1. General way int[] nums1=new int[3];
		 * nums1[0]=1; nums1[1]=2; nums1[2]=3;
		 * 
		 * int[] nums2=new int[0];
		 * 
		 * //2. Anomousous array (array w/ no name) // new int[]{1,2,3}
		 * 
		 * //3. Short hand version int[] nums3= {1,2,3};
		 * 
		 * //Test cases for maxIndex: //1. Array with size 0
		 * 
		 * System.out.println(maxIndex(new int[]{} ) == -1 );
		 * 
		 * //2. Array size >0 // a. all values ordered (increasing/descreasing) // a-1.
		 * all positive System.out.println( maxIndex(new int[]{1,2,3,4} ) == 3 );
		 * System.out.println( maxIndex(new int[]{1,2,3,3,6,6} ) == 4 );
		 * System.out.println( maxIndex(new int[]{21312,123123,466776453} ) == 2 ); //
		 * a-2. all negative // a-3. mix positive + negative // b. values are not
		 * ordered // b-1. all positive // b-2. all negative // b-3. mix positve +
		 * negative
		 */
		
		
		
		//Test cases for maxIndexAndNum()
		//1. 
		
		//2.
		
		
		//3.
//		System.out.println( 
//				maxIndexAndNum(new int[]{1,2,3,3,6,6} ) == new int[] {4,6} );
	
		int [] nums1 = new int[3];
		nums1[0]=1; 
		nums1[1]=2; 
		nums1[2]=3;
		
//		System.out.println( nums1 );
		
		
		//Equal method for array:
		int[] arr1 = new int[3];
		arr1[0]=1;
		arr1[1]=2;
		arr1[2]=3;
		
		int[] arr2 = new int[3];
		arr2[0]=1;
		arr2[1]=2;
		arr2[2]=3;

		//1. arr1 == arr2 ---> 
		//     Compare whether these two arrays have same addree
		System.out.println( arr1==arr2 );
		System.out.println( arr1 );
		System.out.println( arr2 );
		//2. Using the equal method
		//     Compare the actual array elements/value of the two array
		System.out.println( arrayEqual(arr1,arr2));
		
		System.out.println(Arrays.equals(arr1, arr2));
		// 

	}
	
	//Signature:  maxIndex: int[]   -->  int
	//Purpose:  Return the index of largest number
	//            in the given integer array.
	//          If the array is empty -->return -1
	//          If more than 1 largest number -->
	//            return the earlist occured
	//          (What if last occucred one?--> <=)
	//Examples:
	//          maxIndex({1,2,3})-->2
	//          maxIndex({1,2,3,-2,1,2,22,1})-->6
	//          maxIndex({})-->  -1
	//          maxIndex({1,3,2,3})-->1
	public static int maxIndex(int[] orgArr) {
		//1. When orgArr is with size 0 --> -1
		if(orgArr.length==0) {
			return -1;
		}
		
		//2. When the size of orgArr>=1
		int max = orgArr[0];//size of array>=1
		int maxIndex = 0; 
	
		for(int i=0;i<orgArr.length;i++) {
			if(max<orgArr[i]) {
				max=orgArr[i];
				maxIndex=i;
			}	
		}
		
		return maxIndex;
	}
	
	
	
	//Signature:  maxIndexAndNum: int[]   -->  int[]
	//Purpose:  Return the index of largest number
	//          + largest number
	//            in the given integer array.
	//
	//          If the array is empty -->return {-1,-1}
	//          If more than 1 largest number -->
	//            return the earlist occured index + largest nume
	//Examples:
	//          maxIndexAndNum({1,2,3})---> {2,3}
	//          maxIndexAndNum({-1,12,12,13,1})---> {3,13}	
	//          maxIndexAndNum({})---> {-1,-1}	
    //		    maxIndexAndNum({-1,123,12,123,1})---> {1,123}	
	public static int[] maxIndexAndNum(int[] orgArr) {
		
		//1st --> index of max,  2nd---> value of max
		int[] result = new int[2];
		
		//1. When orgArr is with size 0 --> -1
		if(orgArr.length==0) {
			result[0]= -1;
			result[1]= -1;
		}
		
		//2. When the size of orgArr>=1
		int max = orgArr[0];//size of array>=1
		int maxIndex = 0; 
	
		for(int i=0;i<orgArr.length;i++) {
			if(max<orgArr[i]) {
				max=orgArr[i];
				maxIndex=i;
			}	
		}
		
		result[0]= maxIndex;
		result[1]= max;
		
		
		return result;
	}
	
	//Signature:  arrayEqual: int[] int[] --> boolean
	//Purpose: Compare whether the elements in
	//            two given int. arrays are equal?
	//Examples:  arrayEqual({1,2,3},{1,2,3})--> true
	//           arrayEqual({1,2,3},{1,2,3,4}) --> false
    //           arrayEqual({},{}) --> false
	
	public static boolean arrayEqual( int[] arr1, int[] arr2) {
		//1. If array size is different --> return false
		if(arr1.length!=arr2.length) {
			return false;
		}
		//2. Otherwise, check the elements one-by-one
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		
		return true;
	
	}
}
