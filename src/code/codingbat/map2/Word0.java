package code.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of strings, return a Map<String, Integer> containing a key for
 * every different string in the array, always with the value 0. For example the
 * string "hello" makes the pair "hello":0. We'll do more complicated counting
 * later, but for this problem the value is simply 0.
 *
 * word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}.
 *
 * word0(["a", "b", "a", "c","b"]) → {"a": 0, "b": 0, "c": 0}.
 *
 * word0(["c", "b", "a"]) → {"a": 0, "b": 0,"c": 0}.
 */

public class Word0 {
    public static void main(String[] args) {
        System.out.println(word0(new String[] { "a", "b", "a", "b" }));
        System.out.println(word0(new String[] { "a", "b", "a", "c", "b" }));
        System.out.println(word0(new String[] { "c", "b", "a" }));
    }

    public static Map<String, String> word0(String[] strings) {
        return new HashMap<>();
    }
}
