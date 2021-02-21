package code.codingbat.array2;

/**
 * Given an array of ints, return true if the array contains two 7's next to each other,
 * or there are two 7's separated by one element, such as with {7, 1, 7}.
 *
 * has77([1, 7, 7]) → true
 * has77([1, 7, 1, 7]) → true
 * has77([1, 7, 1, 1, 7]) → false
 */

public class Has77 {
    public static void main(String[] args) {
        System.out.println(has77(1, 7, 7));
        System.out.println(has77(1, 7, 1, 7));
        System.out.println(has77(1, 7, 1, 1, 7));
    }

    public static boolean has77(int... nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 7 && nums[i+1] == 7) return true;

        for (int j = 0; j < nums.length-2; j++)
            if (nums[j] == 7 && nums[j+2] == 7) return true;
        }
        return false;
    }
}
