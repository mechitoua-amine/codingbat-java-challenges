package code.codingbat.recursion;

/**
 * Given a string, compute recursively the number of times lowercase "hi" appears in the string,
 * however do not count "hi" that have an 'x' immedately before them.
 *
 * countHi2("ahixhi") → 1
 * countHi2("ahibhi") → 2
 * countHi2("xhixhi") → 0
 */

public class CountHi2 {
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }

    public static int countHi2(String str) {
        return 1;
    }
}
