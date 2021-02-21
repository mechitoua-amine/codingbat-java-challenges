package code.codingbat.warmup1;

/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive.
Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
public class HasTeen {
    public static void main(String[] args) {
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 10, 13));
    }

    public static boolean hasTeen(int a, int b, int c) {
        boolean isATeen = a >= 13 && a <= 19;
        boolean isBTeen = b >= 13 && b <= 19;
        boolean isCTeen = c >= 13 && c <= 19;

        return isATeen || isBTeen || isCTeen;
    }
}
