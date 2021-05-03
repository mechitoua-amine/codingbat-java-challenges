package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, return a list where each string is converted
 * to lower case (Note: String toLowerCase() method).
 *
 * lower(["Hello", "Hi"]) → ["hello", "hi"]
 * lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
 * lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]
 */

public class Lower {
    public static void main(String[] args) {
        System.out.println(lower(new ArrayList<>(Arrays.asList("Hello", "Hi"))));
        System.out.println(lower(new ArrayList<>(Arrays.asList("AAA", "BBB", "ccc"))));
        System.out.println(lower(new ArrayList<>(Arrays.asList("KitteN", "ChocolaTE"))));
    }

    public static List<String> lower(List<String> strings) {
        return new ArrayList<>();
    }
}
