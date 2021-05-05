package code.codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, return a list of the strings, omitting any string
 * that contains a "z". (Note: the str.contains(x) method returns a boolean)
 * <p>
 * noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
 * noZ(["hziz", "hzello", "hi"]) → ["hi"]
 * noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
 */

public class NoZ {
    public static void main(String[] args) {
        System.out.println(noZ(new ArrayList<>(Arrays.asList("aaa", "bbb", "aza"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hziz", "hzello", "hi"))));
        System.out.println(noZ(new ArrayList<>(Arrays.asList("hello", "howz", "are", "youz"))));
    }

    public static List<String> noZ(List<String> strings) {
        return new ArrayList<>();
    }
}
