package code.codingbat.map2;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of non-empty strings, create and return a Map<String, String>
 * as follows: for each string add its first character as a key with its last
 * character as the value.
 *
 * pairs(["code", "bug"]) → {"b": "g", "c": "e"}
 * pairs(["man", "moon", "main"]) → {"m": "n"}
 * pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
 */

public class Pairs {
    public static void main(String[] args) {
        System.out.println(pairs(new String[] {"code", "bug"}));
        System.out.println(pairs(new String[] {"man", "moon", "main"}));
        System.out.println(pairs(new String[] {"man", "moon", "good", "night"}));
    }

    public static Map<String, String> pairs(String[] strings) {
        return new HashMap<>();
    }
}
