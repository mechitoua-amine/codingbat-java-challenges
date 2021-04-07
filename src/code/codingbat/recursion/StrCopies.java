package code.codingbat.recursion;

/**
 * Given a string and a non-empty substring sub, compute recursively
 * if at least n copies of sub appear in the string somewhere, possibly
 * with overlapping. N will be non-negative.
 *
 * strCopies("catcowcat", "cat", 2) → true
 * strCopies("catcowcat", "cow", 2) → false
 * strcopies("catcowcat", "cow", 1) → true
 */
class StrCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strcopies("catcowcat", "cow", 1));
    }

    public static boolean strCopies(String str, String sub, int n) {
        return true;
    }
}
