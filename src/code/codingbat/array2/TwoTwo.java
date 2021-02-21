package code.codingbat.array2;

/**
 * Given an array of ints, return true if every 2 that appears in the array
 * is next to another 2.
 *
 * twoTwo([4, 2, 2, 3]) → true
 * twoTwo([2, 2, 4]) → true
 * twoTwo([2, 2, 4, 2]) → false
 */

public class TwoTwo {
    public static void main(String[] args) {
        System.out.println(twoTwo(4, 2, 2, 3));
        System.out.println(twoTwo(2, 2, 4));
        System.out.println(twoTwo(2, 2, 4, 2));
    }

    public static boolean twoTwo(int... nums) {
        if(nums.length == 1 && nums[0] == 2)
            return false;

        if(nums.length >= 2 && ((nums[0] == 2 && nums[1] != 2) ||
                (nums[nums.length-1] == 2 && nums[nums.length-2] != 2)))
            return false;

        for(int i = 1; i <= nums.length - 2; i++) {
            if(nums[i] == 2 && nums[i-1] != 2 && nums[i+1] != 2)
                return false;
        }
        return true;
    }
    /*
    // alternative solution
    public static boolean twoTwo(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 2) {
                int count = 0;
                for (int j = i; j < nums.length; j++)
                    if (nums[j] == 2) count++;
                    else break;
                i += count;
                if (count < 2) return false;
            }
        return true;
    }
     */
}
