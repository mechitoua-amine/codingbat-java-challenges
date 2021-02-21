package code.codingbat.array1;

/**
 * Given an int array, return true if the array contains 2 twice, or 3 twice.
 * The array will be length 0, 1, or 2.
 * 
 * double23([2, 2]) → true double23([3, 3]) → true double23([2, 3]) → false
 */

class Double23 {
	public static void main(String[] args) {
		System.out.println(double23(2, 2));
		System.out.println(double23(3, 3));
		System.out.println(double23(2, 2));
	}

	public static boolean double23(int... nums) {
		if (nums.length < 2)
			return false;
		if (nums[0] + nums[1] == 4 || nums[0] + nums[1] == 6)
			return true;
		return false;
	}
}
