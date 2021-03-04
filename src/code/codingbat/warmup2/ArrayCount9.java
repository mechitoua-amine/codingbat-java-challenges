package code.codingbat.warmup2;

/**
 * Given an array of ints, return the number of 9's in the array.

 * arrayCount9([1, 2, 9]) → 1
 * arrayCount9([1, 9, 9]) → 2
 * arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class ArrayCount9 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 9 };
        int[] b = { 1, 9, 9 };
        int[] c = { 1, 9, 9, 3, 9 };

        System.out.println(arrayCount9(a));
        System.out.println(arrayCount9(b));
        System.out.println(arrayCount9(c));
    }

    public static int arrayCount9(int[] numbers) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 9)
                count++;
        }
        return count;
    }
}
