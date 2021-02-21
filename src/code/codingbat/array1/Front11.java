package code.codingbat.array1;

import java.util.Arrays;

/**
 * Given 2 int arrays, a and b, of any length, return a new array with the first
 * element of each array. If either array is length 0, ignore that array.
 * 
 * front11([1, 2, 3], [7, 9, 8]) → [1, 7] front11([1], [2]) → [1, 2] front11([1,
 * 7], []) → [1]
 */

class Front11 {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(front11(new int[] { 1, 2, 3 }, new int[] { 7, 9, 8 })));
		System.out.println(Arrays.toString(front11(new int[] { 1 }, new int[] { 2 })));
		System.out.println(Arrays.toString(front11(new int[] { 1, 7 }, new int[] {})));
	}

	public static int[] front11(int[] a, int[] b) {
		int[] one = new int[1];
		int[] two = new int[2];
		if (a.length == 0 && b.length == 0)
			return a;
		if (a.length >= 1 && b.length == 0) {
			one[0] = a[0];
			return one;
		}
		if (a.length >= 1 && b.length >= 1) {
			two[0] = a[0];
			two[1] = b[0];
			return two;
		}
		if (a.length == 0 && b.length >= 1) {
			one[0] = b[0];
			return one;
		}
		return a;
	}
}