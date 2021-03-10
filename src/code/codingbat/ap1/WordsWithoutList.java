package code.codingbat.ap1;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 3));
        System.out.println(
                wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 4));
    }

    public static List<String> wordsWithoutList(String[] words, int n) {
        List<String> newArr = new ArrayList<>();
        for (String word : words) {
            if (word.length() != n)
                newArr.add(word);
        }
        return newArr;
    }
}
