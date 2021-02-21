package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given an array of ints, swap the first and last elements in the array. Return
 * the modified array. The array length will be at least 1.
 * 
 * swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1] swapEnds([1, 2, 3]) → [3, 2, 1]
 * swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

class SwapEnds {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(swapEnds(1, 2, 3, 4)));
		System.out.println(Arrays.toString(swapEnds(1, 2, 3)));
		System.out.println(Arrays.toString(swapEnds(8, 6, 7, 9, 5)));
	}

	public static int[] swapEnds(int... nums) {
		int first = nums[0];
		int last = nums[nums.length - 1];
		nums[0] = last;
		nums[nums.length - 1] = first;
		return nums;
	}
}