package code.codingbat.ap1;

/**
 * Given two arrays, A and B, of non-negative int scores. A "special" score is one which
 * is a multiple of 10, such as 40 or 90. Return the sum of largest special score in A
 * and the largest special score in B. To practice decomposition, write a separate helper
 * method which finds the largest special score in an array. Write your helper method
 * after your scoresSpecial() method in the JavaBat text area.
 *
 * scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
 * scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
 * scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
 */

public class ScoresSpecial {
    public static void main(String[] args) {
        System.out.println(scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}));
        System.out.println(scoresSpecial(new int[]{20, 10, 4}, new int[]{2, 20, 10}));
        System.out.println(scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}));
    }

    public static int scoresSpecial(int[] a, int[] b) {
       return largerSpecialScore(a) + largerSpecialScore(b);
    }

    public static int largerSpecialScore(int... nums) {
        int largest = 0;
        for (int num : nums) {
            if (num % 10 == 0) {
                largest = Math.max(num, largest);
            }
        }
        return largest;
    }
}
