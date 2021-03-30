package code.codingbat.recursion;

/**
 * Given a string, compute recursively a new string where
 * all the lowercase 'x' chars have been moved to the end
 * of the string.
 *
 * endX("xxre") → "rexx"
 * endX("xxhixx") → "hixxxx"
 * endX("xhixhix") → "hihixxx"
 */

class EndX {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
    }

    public static String endX(String str) {
        return "";
    }
}
