package code.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Boolean> where each different
 * string is a key and its value is true if that string appears 2 or more times
 * in the array.
 *
 * wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
 * wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
 * wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

public class WordMultiple {
    public static void main(String[] args) {
        System.out.println(wordMultiple(new String[] {"a", "b", "a", "c", "b"}));
        System.out.println(wordMultiple(new String[] {"c", "b", "a"}));
        System.out.println(wordMultiple(new String[] {"c", "c", "c", "c"}));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Integer> count = new HashMap<>();
        Map<String, Boolean> result = new HashMap<>();

        for (String str : strings) {
            if (count.containsKey(str)) {
                int val = count.get(str);
                val++;
                count.put(str, val);
            } else count.put(str, 1);

            result.put(str, count.get(str) >= 2);
        }

        return result;
    }
}