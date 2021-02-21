package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given 2 int arrays, each length 2, return a new array length 4 containing all
 * their elements.
 * 
 * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4] plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
 * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */

class PlusTwo {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusTwo(new int[] { 1, 2 }, new int[] { 3, 4 })));
		System.out.println(Arrays.toString(plusTwo(new int[] { 4, 4 }, new int[] { 2, 2 })));
		System.out.println(Arrays.toString(plusTwo(new int[] { 9, 2 }, new int[] { 3, 4 })));
	}

	public static int[] plusTwo(int[] a, int[] b) {
		int[] arr = new int[] { a[0], a[1], b[0], b[1] };
		return arr;
	}
}