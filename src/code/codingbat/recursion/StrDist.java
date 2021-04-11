package code.codingbat.recursion;

/**
 * Given a string and a non-empty substring sub, compute recursively
 * the largest substring which starts and ends with sub and return its length.
 *
 * strDist("catcowcat", "cat") → 9
 * strDist("catcowcat", "cow") → 3
 * strDist("cccatcowcatxx", "cat") → 9
 */

public class StrDist {
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    public static int strDist(String str, String sub) {
        return 0;
    }
}
