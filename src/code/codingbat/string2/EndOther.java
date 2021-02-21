package code.codingbat.string2;

/**
 * Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
 Note: str.toLowerCase() returns the lowercase version of a string.
 *
 * endOther("Hiabc", "abc") → true
 * endOther("AbC", "HiaBc") → true
 * endOther("abc", "abXabc") → true
 */

class EndOther {
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc"));
        System.out.println(endOther("AbC", "HiaBc"));
        System.out.println(endOther("abc", "abXabc"));
    }

    public static boolean endOther(String a, String b) {
        String longest = a.length() > b.length() ? a.toLowerCase() : b.toLowerCase();
        String small = a.length() > b.length() ? b.toLowerCase() : a.toLowerCase();
        return longest.endsWith(small);
    }
}
