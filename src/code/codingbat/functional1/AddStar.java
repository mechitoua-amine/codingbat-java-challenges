package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of strings, return a list where each string has "*" added at its end.
 *
 * addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
 * addStar(["hello", "there"]) → ["hello*", "there*"]
 * addStar(["*"]) → ["**"]
 */

public class AddStar {
    public static void main(String[] args) {
        System.out.println(addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(addStar(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
    }

    public static List<String> addStar(List<String> strings) {
        return new ArrayList<>();
    }
}
