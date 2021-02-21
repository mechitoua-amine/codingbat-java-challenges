package code.codingbat.string3;

/**
 * Given a string, return the longest substring that appears at both the beginning
 * and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

 * sameEnds("abXYab") → "ab"
 * sameEnds("xx") → "x"
 * sameEnds("xxx") → "x"
 */

class SameEnds {
    public static void main(String[] args) {
        System.out.println(sameEnds("abXYab"));
        System.out.println(sameEnds("xx"));
        System.out.println(sameEnds("xxx"));
    }

    public static String sameEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0; i <= len / 2; i++)
            for (int j = len / 2; j < len; j++)
                if (string.substring(0, i).equals(string.substring(j)))
                    result = string.substring(0, i);
        return result;
    }
}
