package code.codingbat.ap1;

import java.util.Arrays;

/**
 * Given an array of strings, return a new List (e.g. an ArrayList)
 * where all the strings of the given length are omitted.
 * See wordsWithout() below which is more difficult because it uses arrays.
 *
 * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
 * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
 * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
 */

public class WordsWithoutList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1)));
        System.out.println(Arrays.toString(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3)));
        System.out.println(Arrays.toString(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4)));
    }

    public static String[] wordsWithoutList(String[] words, int n) {
        // implementation.
    }
}
