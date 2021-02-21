package code.codingbat.string3;

/**
 * Given two strings, base and remove, return a version of the base string where
 * all instances of the remove string have been removed (not case sensitive).
 * You may assume that the remove string is length 1 or more. Remove only
 * non-overlapping instances, so with "xxx" removing "xx" leaves "x".
 *
 * withoutString("Hello there", "llo") → "He there"
 * withoutString("Hellothere","e") → "Hllo thr"
 * withoutString("Hello there","x") → "Hello there"
 */

public class WithoutString {
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
    }
    // 1 result = "H"
    // base = "llo there"
    // 6 result = "Hllo th"
    // base = "re"
    // final output "Hllo thr"
    public static String withoutString(String base, String remove) {
        String result = "";
        int index = base.toLowerCase().indexOf(remove.toLowerCase());
        while (index != -1) {
            result += base.substring(0, index);
            base = base.substring(index + remove.length());
            index = base.toLowerCase().indexOf(remove.toLowerCase());
        }
        result += base;
        return result;
    }
}
