package code.codingbat.ap1;

/**
 * Given an array of scores sorted in increasing order, return true if the array contains
 * 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
 *
 * scoresClump([3, 4, 5]) → true
 * scoresClump([3, 4, 6]) → false
 * scoresClump([1, 3, 5, 5]) → true
 */

public class ScoresClump {
    public static void main(String[] args) {
        System.out.println(scoresClump(3, 4, 5));
        System.out.println(scoresClump(3, 4, 6));
        System.out.println(scoresClump(1, 3, 5, 5));
    }

    public static boolean scoresClump(int... scores) {
        return true;
    }
}
