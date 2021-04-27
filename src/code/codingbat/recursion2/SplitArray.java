package code.codingbat.recursion2;

/**
 * Given an array of ints, is it possible to divide the ints into two groups, so
 * that the sums of the two groups are the same. Every int must be in one group
 * or the other. Write a recursive helper method that takes whatever arguments
 * you like, and make the initial call to your recursive helper from
 * splitArray(). (No loops needed.)
 *
 *
 * splitArray([2, 2]) → true
 *
 * splitArray([2, 3]) → false
 *
 * splitArray([5, 2, 3]) → true
 */

public class SplitArray {
    public static void main(String[] args) {
        System.out.println(splitArray(2, 2));
        System.out.println(splitArray(2, 3));
        System.out.println(splitArray(5, 2, 3));
    }

    public static Boolean splitArray(int... nums) {
        return true;
    }
}
