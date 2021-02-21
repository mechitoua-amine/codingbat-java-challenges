package code.codingbat.string3;

/**
 * Given a string, look for a mirror image (backwards) string at both
 * the beginning and end of the given string. In other words, zero or more
 * characters at the very begining of the given string, and at the very end
 * of the string in reverse order (possibly overlapping). For example,
 * the string "abXYZba" has the mirror end "ab".

 * mirrorEnds("abXYZba") → "ab"
 * mirrorEnds("abca") → "a"
 * mirrorEnds("aba") → "aba"
 */

class MirrorEnds {
    public static void main(String[] args) {
        System.out.println(mirrorEnds("abXYZba"));
        System.out.println(mirrorEnds("abca"));
        System.out.println(mirrorEnds("aba"));
    }

    public static String mirrorEnds(String string) {
        String result = "";
        int len = string.length();
        for (int i = 0, j = len - 1; i < len; i++, j--)
            if (string.charAt(i) == string.charAt(j))
                result += string.charAt(i);
            else break;
        return result;
    }
}
