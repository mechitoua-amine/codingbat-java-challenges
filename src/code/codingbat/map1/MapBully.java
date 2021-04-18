package code.codingbat.map1;

import java.util.Map;
import java.util.HashMap;

/**
 * Modify and return the given map as follows: if the key "a" has a value, set
 * the key "b" to have that value, and set the key "a" to have the value "".
 * Basically "b" is a bully, taking the value and replacing it with the empty
 * string.
 *
 * mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
 *
 * mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
 *
 * mapBully({"a": "candy","b": "carrot", "c": "meh"}) → {"a": "", "b": "candy",
 * "c": "meh"}
 */

class MapBully {
    public static void main(String[] args) {
        System.out.println(mapBully(new HashMap<String, String>() {
            {
                put("a", "candy");
                put("b", "dirt");
            }
        }).toString());
        System.out.println(mapBully(new HashMap<String, String>() {
            {
                put("a", "candy");
            }
        }).toString());
        System.out.println(mapBully(new HashMap<String, String>() {
            {
                put("a", "candy");
                put("b", "carrot");
                put("c", "meh");
            }
        }).toString());
    }

    public static Map<String, String> mapBully(Map<String, String> map) {
        // return new HashMap<String, String>();
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}