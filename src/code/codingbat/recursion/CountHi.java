package code.codingbat.recursion;

/**
 * Given a string, compute recursively (no loops) the number
 * of times lowercase "hi" appears in the string.
 *
 * countHi("xxhixx") → 1
 * counthi("xhixhix") → 2
 * countHi("hi") → 1
 */

class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(counthi("xhixhix"));
        System.out.println(countHi("hi"));
    }

    public static int countHi(String str) {
        return 0;
    }
}
