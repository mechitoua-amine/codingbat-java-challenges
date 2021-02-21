package code.codingbat.string1;

/**
 * Given a string of odd length, return the string length 3 from its middle, so
 * "Candy" yields "and". The string length will be at least 3.
 *
 * middleThree("Candy") → "and" middleThree("and") → "and"
 * middleThree("solving") → "lvi"
 */

public class MiddleThree {
    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    public static String middleThree(String str) {
        if (str.length() <= 3)
            return str;
        int half = str.length() / 2;
        return str.substring(half - 1, half + 2);
    }
}
// alternative solution
/*
 * public String middleThree(String str) { int len = str.length(); if (len == 3)
 * return str; return str.substring(len / 2 - 1, len / 2 + 2); }
 */