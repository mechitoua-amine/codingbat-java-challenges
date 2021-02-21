package code.codingbat.array1;

/**
 * Given an array of ints of odd length, look at the first, last, and middle
 * values in the array and return the largest. The array length will be a least
 * 1.
 * 
 * maxTriple([1, 2, 3]) → 3 maxTriple([1, 5, 3]) → 5 maxTriple([5, 2, 3]) → 5
 */

class MaxTripple {
	public static void main(String[] args) {
		System.out.println(maxTriple(1, 2, 3));
		System.out.println(maxTriple(1, 5, 3));
		System.out.println(maxTriple(5, 2, 3));
	}

	public static int maxTriple(int... nums) {
		if (nums.length < 1)
			return 0;
		int middle = nums.length / 2;
		return Math.max(nums[0], Math.max(nums[middle], nums[nums.length - 1]));
	}
}