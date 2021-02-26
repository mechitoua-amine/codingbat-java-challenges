package code.codingbat.string1;

/**
 * Given two strings, append them together (known as "concatenation") and return
 * the result. However, if the concatenation creates a double-char, then omit
 * one of the chars, so "abc" and "cat" yields "abcat".
 *
 * conCat("abc", "cat") → "abcat"
 * conCat("dog", "cat") → "dogcat"
 * conCat("abc","") → "abc"
 */

public class ConCat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    public static String conCat(String a, String b) {
        if (a.length() != 0 && b.length() != 0) {
            if (b.charAt(0) == a.charAt(a.length() - 1))
                return a + b.substring(1);
        }
        return a + b;
    }
}
