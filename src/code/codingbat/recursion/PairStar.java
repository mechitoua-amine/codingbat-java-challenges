package code.codingbat.recursion;

/**
 * Given a string, compute recursively a new string where identical
 * chars that are adjacent in the original string are separated from
 * each other by a "*".
 *
 * pairStar("hello") → "hel*lo"
 * pairStar("xxyy") → "x*xy*y"
 * pairStar("aaaa") → "a*a*a*a"
 */

class PairStar {
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar("aaaa"));
    }

    public static String pairStar(String str) {
        if (str.length() < 2) return str;
        if (str.charAt(0) == str.charAt(1))
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
