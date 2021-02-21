package code.codingbat.warmup2;

/*
Given a string and a non-negative int n,
return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("hi", 1));
    }

    public static String stringTimes(String str, int n) {
        if (n == 0)
            return "";

        return str + stringTimes(str, n - 1);
    }
}
