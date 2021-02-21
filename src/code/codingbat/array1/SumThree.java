package code.codingbat.array1;

/**
 * Given an array of ints length 3, return the sum of all the elements.
 * 
 * sum3([1, 2, 3]) → 6 sum3([5, 11, 2]) → 18 sum3([7, 0, 0]) → 7
 */

class SumThree {
	public static void main(String[] args) {
		System.out.println(sum3(1, 2, 3));
		System.out.println(sum3(5, 11, 2));
		System.out.println(sum3(7, 0, 0));
	}

	public static int sum3(int... nums) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		return sum;
	}
}