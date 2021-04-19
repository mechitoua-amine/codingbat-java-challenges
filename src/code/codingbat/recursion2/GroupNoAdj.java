package code.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to choose a group of some of the ints,
 * such that the group sums to the given target with this additional constraint:
 * If a value in the array is chosen to be in the group, the value immediately
 * following it in the array must not be chosen. (No loops needed.)
 *
 * groupNoAdj(0, [2, 5, 10, 4], 12) → true
 * groupNoAdj(0, [2, 5, 10, 4], 14) → false
 * groupNoAdj(0, [2, 5, 10, 4], 7) → false
 */

public class GroupNoAdj {
    public static void main(String[] args) {
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 12));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 14));
        System.out.println(groupNoAdj(0, new int[]{2, 5, 10, 4}, 7));
    }

    public static boolean groupNoAdj(int start, int[] nums, int end) {
        return true;
    }
}
