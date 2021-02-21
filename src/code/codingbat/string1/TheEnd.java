package code.codingbat.string1;
/*
Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */

public class TheEnd {

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
        System.out.println(theEnd("oh", true));
    }

    public static String theEnd(String str, boolean flag) {
        if (str.length() == 0)
            return "";
        if (flag)
            return str.substring(0, 1);
        return str.substring(str.length() - 1);
    }
}
