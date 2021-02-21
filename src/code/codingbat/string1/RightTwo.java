package code.codingbat.string1;
/*
Given a string, return a "rotated right 2" version where the last 2 chars are
moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */

public class RightTwo {
    public static void main(String[] args) {
        System.out.println(rightTwo("Hello"));
        System.out.println(rightTwo("java"));
        System.out.println(rightTwo("Hi"));
    }

    public static String rightTwo(String str) {
        if (str.length() < 2)
            return str;
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
