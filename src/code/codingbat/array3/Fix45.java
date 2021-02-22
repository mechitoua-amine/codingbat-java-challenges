package code.codingbat.array3;

import java.util.Arrays;

/**
 *Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 4 is immediately followed by a 5. Do not move
 * the 4's, but every other number may move. The array contains the same number
 * of 4's and 5's, and every 4 has a number after it that is not a 4.
 * In this version, 5's may appear anywhere in the original array.
 *
 * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
 * fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
 * fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */

public class Fix45 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45(5, 4, 9, 4, 9, 5)));
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5)));
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5, 5, 4, 1)));
    }
    /*
        for every element in the array:
            if the element is equal to 5 && the index i of element equals 0
              or element equals 5 and the previous element is not equal to 4
                positionOfFive = elementIndex
                for every element j in the array:
                    if element at index j equals 4 && the element at index j+1 not equal to 5
                    tempVariable = index of j + 1
                    index of j+1 = 5
                    element at position positionOfFive = tempVariable
                    break the loop

            return the array

     */
    public static int[] fix45(int... nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 5 && i == 0
                    || nums[i] == 5 && nums[i - 1] != 4) {
                int pos5 = i;
                for (int j = 0; j < nums.length; j++)
                    if (nums[j] == 4 && nums[j + 1] != 5) {
                        int temp = nums[j + 1];
                        nums[j + 1] = 5;
                        nums[pos5] = temp;
                        break;
                    }
            }
        return nums;
    }
}
