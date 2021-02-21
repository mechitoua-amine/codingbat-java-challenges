package code.codingbat.string1;
/*
Given a string, return a version without both the first and last char of the
string. The string may be any length, including 0.

withoutEnd2("Hello") → "ell"
withoutEnd2("abc") → "b"
withoutEnd2("ab") → ""
 */

public class WithoutEnd2 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));
        System.out.println(withoutEnd2("abc"));
        System.out.println(withoutEnd2("ab"));
    }

    public static String withoutEnd2(String str) {
        if (str.length() <= 2)
            return "";
        return str.substring(1, str.length() - 1);
    }
}
