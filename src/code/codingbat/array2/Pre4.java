package code.codingbat.array2;

import java.util.Arrays;

/**
 * Given a non-empty array of ints, return a new array containing the elements
 * from the original array that come before the first 4 in the original array.
 * The original array will contain at least one 4. Note that it is valid in
 * java to create an array of length 0.
 *
 * pre4([1, 2, 4, 1]) → [1, 2]
 * pre4([3, 1, 4]) → [3, 1]
 * pre4([1, 4, 4]) → [1]
 */

public class Pre4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pre4(1, 2, 4, 1)));
        System.out.println(Arrays.toString(pre4(3, 1, 4)));
        System.out.println(Arrays.toString(pre4(1, 4, 4)));
    }

    public static int[] pre4(int... nums) {
        int count = 0;
        for (int num : nums) {
            if (num != 4) count++;
            else break;
        }
        int[] result = new int[count];
        if (result.length >= 0)
            System.arraycopy(nums, 0, result, 0, result.length);
        return result;
    }
    /*
     // Alternative solution
     public int[] pre4(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 4) count++;
            else break;
        }
        int[] result = new int[count];
        for (int i = 0; i < result.length; i++)
            result[i] = nums[i];
        return result;
     }
     */
}
