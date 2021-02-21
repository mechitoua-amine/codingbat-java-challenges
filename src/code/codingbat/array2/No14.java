package code.codingbat.array2;

/**
 * Given an array of ints, return true if it contains no 1's or it contains
 * no 4's.
 *
 * no14([1, 2, 3]) → true
 * no14([1, 2, 3, 4]) → false
 * no14([2, 3, 4]) → true
 */
public class No14 {
    public static void main(String[] args) {
        System.out.println(no14(1, 2, 3));
        System.out.println(no14(1, 2, 3, 4));
        System.out.println(no14(2, 3, 4));
    }

    public static boolean no14(int... nums) {
        int ones = 0;
        int fours = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) ones++;
            if (nums[i] == 4) fours++;
        }
        return ones == 0 || fours == 0;
    }
}
