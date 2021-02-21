package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given an array of ints length 3, return an array with the elements "rotated
 * left" so {1, 2, 3} yields {2, 3, 1}.
 * 
 * rotateLeft3([1, 2, 3]) → [2, 3, 1] rotateLeft3([5, 11, 9]) → [11, 9, 5]
 * rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */

class RotateLeft3 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = { 5, 11, 9 };
		int[] c = { 0, 0, 7 };

		System.out.println(Arrays.toString(rotateLeft3(a)));
		System.out.println(Arrays.toString(rotateLeft3(b)));
		System.out.println(Arrays.toString(rotateLeft3(c)));
	}

	public static int[] rotateLeft3(int[] nums) {
		int[] rLeft = { nums[1], nums[2], nums[0] };
		return rLeft;
	}
}
