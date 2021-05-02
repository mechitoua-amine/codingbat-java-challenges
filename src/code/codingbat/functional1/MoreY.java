package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of strings, return a list where each
 * string has "y" added at its start and end.
 *
 *
 * moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
 * moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
 * moreY(["yay"]) → ["yyayy"]
 */

public class MoreY {
    public static void main(String[] args) {
        System.out.println(moreY(new ArrayList<>(Arrays.asList("a", "b", "c"))));
        System.out.println(moreY(new ArrayList<>(Arrays.asList("hello", "there"))));
        System.out.println(moreY(new ArrayList<>(Collections.singletonList("yay"))));
    }

    public static List<String> moreY(List<String> strings) {
        strings.replaceAll(str -> "y"+str+"y");
        return strings;
    }
}
