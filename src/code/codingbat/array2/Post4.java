package code.codingbat.array2;

import java.util.Arrays;

/**
 * Given a non-empty array of ints, return a new array containing the elements
 * from the original array that come after the last 4 in the original array.
 * The original array will contain at least one 4.
 * Note that it is valid in java to create an array of length 0.
 *
 * post4([2, 4, 1, 2]) → [1, 2]
 * post4([4, 1, 4, 2]) → [2]
 * post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */

public class Post4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(post4(2, 4, 1, 2)));
        System.out.println(Arrays.toString(post4(4, 1, 4, 2)));
        System.out.println(Arrays.toString(post4(4, 4, 1, 2, 3)));
    }

    public static int[] post4(int... nums) {
        int last4 = 0;
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 4) last4 = i;

        int[] res = new int[nums.length - (last4 + 1)];
        for (int i = last4 + 1, j = 0; i < nums.length; i++, j++)
            res[j] = nums[i];

        return res;
    }
}
