package code.codingbat.ap1;

/**
 * Given an array of scores, return true if there are scores of 100 next
 * to each other in the array. The array length will be at least 2.
 *
 * scores100([1, 100, 100]) → true
 * scores100([1, 100, 99, 100]) → false
 * scores100([100, 1, 100, 100]) → true
 */
public class Scores100 {
    public static void main(String[] args) {
        System.out.println(scores100(1, 100, 100));
        System.out.println(scores100(1, 100, 99, 100));
        System.out.println(scores100(100, 1, 100, 100));
    }

    public static boolean scores100(int... scores) {
        return true;
    }
}
