package code.codingbat.functional2;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * Given a list of non-negative integers, return a list of those numbers
 * multiplied by 2, omitting any of the resulting numbers that end in 2.
 *
 * two2([1, 2, 3]) → [4, 6]
 * two2([2, 6, 11]) → [4]
 * two2([0]) → [0]
 */

public class Two2 {
    public static void main(String[] args) {
        System.out.println(two2(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(two2(new ArrayList<>(Arrays.asList(2, 6, 11))));
        System.out.println(two2(new ArrayList<>(Collections.singletonList(0))));
    }

    public static List<Integer> two2(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        nums.removeIf(n -> n % 10 == 2);
        return nums;
    }
}
