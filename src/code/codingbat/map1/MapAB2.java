package code.codingbat.map1;

import java.util.HashMap;
import java.util.Map;

/**
 * Modify and return the given map as follows: if the keys "a" and "b"
 * are both in the map and have equal values, remove them both.
 *
 * mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
 * mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
 * mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"})
 *      → {"a": "aaa", "b": "bbb", "c": "aaa"}
 */

public class MapAB2 {
    public static void main(String[] args) {
        System.out.println(mapAB2(new HashMap<>() {
            {
                put("a", "aaa");
                put("b", "aaa");
                put("c", "cake");
            }
        }));
        System.out.println(mapAB2(new HashMap<>() {
            {
                put("a", "aaa");
                put("b", "bbb");
            }
        }));
        System.out.println(mapAB2(new HashMap<>() {
            {
                put("a", "aaa");
                put("b", "bbb");
                put("c", "aaa");
            }
        }));
    }

    public static Map<String, String> mapAB2(Map<String, String> map) {
        return new HashMap<>();
    }
}
