package code.codingbat.array2;

/**
 * Given an array of ints, return true if the value 3 appears in the array exactly 3 times,
 * and no 3's are next to each other.
 *
 * haveThree([3, 1, 3, 1, 3]) → true
 * haveThree([3, 1, 3, 3]) → false
 * haveThree([3, 4, 3, 3, 4]) → false
 */

public class HaveThree {
    public static void main(String[] args) {
        System.out.println(haveThree(3, 1, 3, 1, 3));
        System.out.println(haveThree(3, 1, 3, 3));
        System.out.println(haveThree(3, 4, 3, 3, 4));
    }

    public static boolean haveThree(int... nums) {
        int count = 0;
        int pos = -2; // in case nums[0] == 3

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i - pos == 1) return false;
                pos = i;
            }
        }

        return count == 3;
    }
}
