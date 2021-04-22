package code.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

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
        Map<String, Integer> map = new HashMap<>();
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (map.containsKey(str)) {
                int val = map.get(str);
                val++;
                if (val % 2 == 0) result.append(str);
                map.put(str, val);
            } else map.put(str, 1);
        }

        return result.toString();
    }
}
