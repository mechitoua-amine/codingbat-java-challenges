package code.codingbat.recursion;

/**
 * Given a string, compute recursively (no loops) the number of "11" substrings in the string.
 * he "11" substrings should not overlap.
 *
 * count11("11abc11") → 2
 * count11("abc11x11x11") → 3
 * count11("111") → 1
 */

public class Count11 {
    public static void main(String[] args) {
        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));
    }

    public static int count11(String str) {
        return 0;
    }
}
