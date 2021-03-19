package code.codingbat.recursion;

/**
 * Given a string, compute recursively (no loops) the number
 * of times lowercase "hi" appears in the string.
 *
 * countHi("xxhixx") → 1
 * countHi("xhixhix") → 2
 * countHi("hi") → 1
 */

class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
    }

    public static int countHi(String str) {
        if (str.length() < 2) return 0;
        if (str.substring(0,2).equals("hi")) return 1 + countHi(str.substring(2));
        return countHi(str.substring(1));
    }
}
