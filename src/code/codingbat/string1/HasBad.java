package code.codingbat.string1;

/**
 * Given a string, return true if "bad" appears starting at index 0 or 1 in the
 * string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may
 * be any length, including 0. Note: use .equals() to compare 2 strings.
 *
 * hasBad("badxx") → true hasBad("xbadxx") → true hasBad("xxbadxx") → false
 */

public class HasBad {
    public static void main(String[] args) {
        System.out.println(hasBad("badxx"));
        System.out.println(hasBad("xbadxx"));
        System.out.println(hasBad("xxbadxx"));
    }

    public static boolean hasBad(String str) {
        if (str.length() <= 2)
            return false;
        if (str.length() == 3)
            return str.startsWith("bad");
        return str.startsWith("bad") || str.substring(1, 4).equals("bad");
    }

    /*
     * if (str.length() <= 2) return false; if (str.length() == 3) return
     * str.substring(0, 3).equals("bad"); return str.substring(0, 3).equals("bad")
     * || str.substring(1, 4).equals("bad");
     */

    /*
     * public boolean hasBad(String str) { if (str.length()>=3 && str.substring(0,
     * 3).equals("bad")) { return true; } if (str.length()>=4 && str.substring(1,
     * 4).equals("bad")) { return true; } return false;
     * 
     * // Solution notes: basically want to call substring(0, 3) and // substring(1,
     * 4) and check if that equals "bad". Need to check // the length first so as to
     * not go off the end of the string. // Alternately one could use indexOf() --
     * that code is short // but it runs much slower, since it needlessly checks
     * over the whole // string. }
     */
}
