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

    public static Boolean split53(int... nums) {
        return true;
    }
}
