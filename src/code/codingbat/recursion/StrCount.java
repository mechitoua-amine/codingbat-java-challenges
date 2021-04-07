package code.codingbat.recursion;

/**
 * Given a string and a non-empty substring sub, compute recursively
 * the number of times that sub appears in the string, without the
 * sub strings overlapping.
 *
 * strCount("catcowcat", "cat") → 2
 * strCount("catcowcat", "cow") → 1
 * strCount("catcowcat", "dog") → 0
 */

class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }

    public static int strCount(String str, String sub) {
        int sub_len = sub.length();
        if (str.length() < sub_len) return 0;
        if (str.substring(0, sub_len).equals(sub))
            return 1 + strCount(str.substring(sub_len), sub);
        return strCount(str.substring(1), sub);
    }
}
