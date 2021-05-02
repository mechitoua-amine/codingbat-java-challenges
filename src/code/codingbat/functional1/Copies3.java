package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, return a list where each string is replaced
 * by 3 copies of the string concatenated together.
 *
 * copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
 * copies3(["24", "a", ""]) → ["242424", "aaa", ""]
 * copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
 */

public class Copies3 {
    public static void main(String[] args) {
        System.out.println(copies3(new ArrayList<>(Arrays.asList("a", "bb", "ccc"))));
        System.out.println(copies3(new ArrayList<>(Arrays.asList("24", "a", ""))));
        System.out.println(copies3(new ArrayList<>(Arrays.asList("hello", "there"))));
    }

    public static List<String> copies3(List<String> strings) {
        strings.replaceAll(str -> str+str+str);
        return strings;
    }
}
