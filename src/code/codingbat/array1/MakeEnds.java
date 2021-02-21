package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given an array of ints, return a new array length 2 containing the first and
 * last elements from the original array. The original array will be length 1 or
 * more.
 * 
 * makeEnds([1, 2, 3]) → [1, 3] makeEnds([1, 2, 3, 4]) → [1, 4] makeEnds([7, 4,
 * 6, 2]) → [7, 2]
 */

class MakeEnds {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(makeEnds(1, 2, 3)));
		System.out.println(Arrays.toString(makeEnds(1, 2, 3, 4)));
		System.out.println(Arrays.toString(makeEnds(7, 4, 6, 2)));
	}

	public static int[] makeEnds(int... nums) {
		if (nums.length < 2)
			return new int[] { nums[0], nums[0] };
		int[] arr = { nums[0], nums[nums.length - 1] };
		return arr;
	}
}