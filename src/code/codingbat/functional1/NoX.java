package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string has all its "x" removed.
 *
 * noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
 * noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
 * noX(["x"]) → [""]
 */

public class NoX {
    public static void main(String[] args) {
        System.out.println(noX(new ArrayList<>(Arrays.asList("ax", "bb", "cx"))));
        System.out.println(noX(new ArrayList<>(Arrays.asList("xxax", "xbxbx", "xxcx"))));
        System.out.println(noX(new ArrayList<>(Collections.singletonList("x"))));
    }

    public static List<String> noX(List<String> strings) {
        strings.replaceAll(str -> str.replaceAll("x", ""));
        return strings;
    }
}
