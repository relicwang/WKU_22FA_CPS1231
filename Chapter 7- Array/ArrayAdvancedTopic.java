package chapter7_array;

import java.util.Arrays;

public class ArrayAdvancedTopic {

	public static void main(String[] args) {
		// 1. How to print array

		// a. primitive variable print:
		int num = 1;
		System.out.println(num);

		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;

		// Only print the address/reference of the given array
		System.out.println(nums);

		// Print actual element
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

		// 2. Compare the equality of two arrays

		// a. Equality among two primitive datatype
//		int i = 1;
//		int j = 1;
//		System.out.println(i == j);

		// b. Equality among two reference data type
		// e.g. array

		int[] nums1 = new int[3];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;

		int[] nums2 = new int[3];
		nums[0] = 1;
		nums[1] = 5;
		nums[2] = 7;

		System.out.println(nums1);
		System.out.println(nums2);
		// Only compare the addresses of two array
		System.out.println(nums1 == nums2);

		// How to do the real comparison
		// --> compare the elements one by one
		System.out.println(arrayEqual(nums1, nums2));
		System.out.println(Arrays.equals(nums1, nums2));

		// 3. Copy the array
		// a. Copy primitive data type variable
		int num2 = 1;
		int num3 = num2;

		num3 = -2;
		System.out.println(num3);
		System.out.println(num2);

		// b. Copy two reference data type
		// e.g. array

		int[] nums5 = new int[3];
		nums5[0] = 1;
		nums5[1] = 5;
		nums5[2] = 7;
		
		//Not real copy, only copy the address
		//   from nums5 to nums6 -->
		//   both nums5 and nums6 refer/point to 
        //   the same array
		int[] nums6 = nums5;
		
		System.out.println(nums5);
		System.out.println(nums6);
		
//		nums6[0]=-2;
//		System.out.println(nums6[0]);//-2
//		System.out.println(nums5[0]);//?-2,  ?1
		
		
		//How to do the true copy? ==Copy all elements
		
		int[] nums7 = new int[nums5.length];
		for(int i=0;i<nums5.length;i++) {
			nums7[i]=nums5[i];
		}
		System.out.println("Address for nums7"+nums7);
		System.out.println("Address for nums5"+nums5);

		nums7[0]=-77;
		System.out.println(nums7[0]);//-77
		System.out.println(nums5[0]);//?-77,?1
	}

	// arrayEqual: int[] int[] ---> boolean
	// Compare whether the elements are identical in
	// two given array in order. Return true if they
	// are same, otherwise, return false.
	// Examples: arrayEqual({1,2,3},{1,2,3})-->true
	// arrayEqual({},{})-->true
	// arrayEqual({1,6,3},{1,2,3})-->false
	// arrayEqual({1,3,2},{1,2,3})-->false
	// arrayEqual({1,2,3},{1,2,3,4})-->false
	public static boolean arrayEqual(int[] arr1, int[] arr2) {
		// 1. Both array have different length
		if (arr1.length != arr2.length) {
			return false;
		}

		// 2. Both array have the same length
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}

		// After compare all elments, all are the same
		return true;

	}

}
