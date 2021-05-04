package code.codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of integers, return a list of those numbers,
 * omitting any that are between 13 and 19 inclusive.
 *
 * noTeen([12, 13, 19, 20]) → [12, 20]
 * noTeen([1, 14, 1]) → [1, 1]
 * noTeen([15]) → []
 */

public class NoTeen {
    public static void main(String[] args) {
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(12, 13, 19, 20))));
        System.out.println(noTeen(new ArrayList<>(Arrays.asList(1, 14, 1))));
        System.out.println(noTeen(new ArrayList<>(Collections.singletonList(15))));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(n -> n >= 13 && n <= 19);
        return nums;
    }
}
