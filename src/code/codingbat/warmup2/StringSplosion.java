package code.codingbat.warmup2;

/*
    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"
 */

public class StringSplosion {
    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));
    }

    public static String stringSplosion(String str) {
        if (str.length() == 0)
            return "";

        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(0, i + 1);
        }
        return newStr;
    }
}
