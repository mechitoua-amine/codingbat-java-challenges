package code.codingbat.recursion;

/**
 * Given a string, compute recursively a new string where all the 'x'
 * chars have been removed.

 * noX("xaxb") → "ab"
 * noX("abc") → "abc"
 * noX("xx") → ""
 */

class NoX {
    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }

    public static String noX(String str) {
        return "";
    }
}
