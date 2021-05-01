package code.codingbat.functional1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, return a list where each integer is multiplied by
 * 2.
 *
 * doubling([1, 2, 3]) → [2, 4, 6]
 *
 * doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
 *
 * doubling([]) → []
 */

public class Doubling {
    public static void main(String[] args) {
        System.out.println(doubling(new ArrayList<>(Arrays.asList(1, 2, 3))));
        System.out.println(doubling(new ArrayList<>(Arrays.asList(6, 8, 6, 8, -1))));
        System.out.println(doubling(new ArrayList<>()));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        nums.replaceAll(n -> n * 2);
        return nums;

        // OR the equivalent java streams solution:
        // return nums.stream()
        // .map(n -> n * 2)
        // .collect(Collectors.toList());
    }
}
