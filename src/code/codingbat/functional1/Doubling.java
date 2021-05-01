package code.codingbat.functional1;

/**
 * Given a list of integers, return a list where each integer is multiplied by
 * 2.
 *
 * doubling([1, 2, 3]) → [2, 4, 6]
 *
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 *
 * doubling([]) → []
 */

public class Doubling {
    public static void main(String[] args) {
        System.out.println(doubling(1, 2, 3));
        System.out.println(doubling(6, 8, 6, 8, -1));
        System.out.println(doubling());
    }

    public static int[] doubling(int... nums) {
        return new int[] {};
    }
}
