package code.codingbat.functional2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given a list of integers, return a list of those numbers squared
 * and the product added to 10, omitting any of the resulting numbers
 * that end in 5 or 6.
 *
 * square56([3, 1, 4]) → [19, 11]
 * square56([1]) → [11]
 * square56([2]) → [14
 */

public class Square56 {
    public static void main(String[] args) {
        System.out.println(square56(new ArrayList<>(Arrays.asList(3, 1, 4))));
        System.out.println(square56(new ArrayList<>(Collections.singletonList(1))));
        System.out.println(square56(new ArrayList<>(Collections.singletonList(2))));
    }

    public static List<Integer> square56(List<Integer> nums) {
        return new ArrayList<>();
    }
}
