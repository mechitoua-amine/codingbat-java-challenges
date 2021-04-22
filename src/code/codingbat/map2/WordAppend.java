package code.codingbat.map2;

/**
 * Loop over the given array of strings to build a result string like this:
 * when a string appears the 2nd, 4th, 6th, etc. time in the array, append
 * the string to the result. Return the empty string if no string appears a 2nd time.
 *
 * wordAppend(["a", "b", "a"]) → "a"
 * wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
 * wordAppend(["a", "", "a"]) → "a"
 */

public class WordAppend {
    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a"}));
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
        System.out.println(wordAppend(new String[]{"a", "", "a"}));
    }

    public static String wordAppend(String[] strings) {
        return "";
    }
}
