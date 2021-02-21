package code.codingbat.string2;

/**
 * Given a string, does "xyz" appear in the middle of the string? To define
 * middle, we'll say that the number of chars to the left and right of the "xyz"
 * must differ by at most one. This problem is harder than it looks.
 *
 * xyzMiddle("AAxyzBB") → true xyzMiddle("AxyzBB") → true xyzMiddle("AxyzBBB") →
 * false
 */

class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3)
            return false;
        if (len % 2 == 1)
            return str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");

        return str.substring(len / 2 - 2, len / 2 + 1).equals("xyz")
                || str.substring(len / 2 - 1, len / 2 + 2).equals("xyz");
    }
}
