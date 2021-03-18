package code.codingbat.recursion;

/**
 * Given a string, compute recursively (no loops) the number
 * of lowercase 'x' chars in the string.
 *
 * countX("xxhixx") → 4
 * countX("xhixhix") → 4
 * countX("hi") → 0
 */

public class CountX {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }

    public static int countX(String str) {
        return 0;
    }
}
