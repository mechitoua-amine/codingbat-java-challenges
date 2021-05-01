package code.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so
 * that the sum of the two groups is the same, with these constraints: all the
 * values that are multiple of 5 must be in one group, and all the valuses that
 * are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops
 * needed.)
 *
 * split53([1, 1]) → true
 *
 * split53([1, 1, 1]) → false
 *
 * split53([2, 4, 2]) → true
 */
class Split53 {
    public static void main(String[] args) {
        System.out.println(split53(1, 1));
        System.out.println(split53(1, 1, 1));
        System.out.println(split53(2, 4, 2));
    }

    public static boolean split53(int... nums) {
        return helper(0, nums, 0, 0);
    }

    private static boolean helper(int start, int[] nums, int sum1, int sum2) {
        if (start >= nums.length)
            return sum1 == sum2;
        if (nums[start] % 5 == 0)
            return helper(start + 1, nums, sum1 + nums[start], sum2);
        if (nums[start] % 3 == 0)
            return helper(start + 1, nums, sum1, sum2 + nums[start]);

        return helper(start + 1, nums, sum1 + nums[start], sum2) || helper(start + 1, nums, sum1, sum2 + nums[start]);
    }
}
