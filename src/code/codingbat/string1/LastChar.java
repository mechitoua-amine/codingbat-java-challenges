package code.codingbat.string1;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and
 * the last char of b, so "yo" and "java" yields "ya". If either string is
 * length 0, use '@' for its missing char.
 *
 * lastChars("last", "chars") → "ls" lastChars("yo", "java") → "ya"
 * lastChars("hi", "") → "h@"
 */

public class LastChar {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", "java"));
        System.out.println(lastChars("hi", ""));
    }

    public static String lastChars(String a, String b) {
        if (a.length() == 0 && b.length() != 0)
            return "@" + "" + b.charAt(b.length() - 1);
        if (b.length() == 0 && a.length() != 0)
            return a.charAt(0) + "@";
        if (a.length() == 0)
            return "@@";
        return a.charAt(0) + "" + b.charAt(b.length() - 1);
    }
}
