package code.codingbat.string2;

/**
 * Given a string and an int n, return a string made of n repetitions of
 * the last n characters of the string. You may assume that n is between
 * 0 and the length of the string, inclusive.

 * repeatEnd("Hello", 3) → "llollollo"
 * repeatEnd("Hello", 2) → "lolo"
 * repeatEnd("Hello", 1) → "o"
 */

class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 1));
    }

    public static String repeatEnd(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++)
            res += str.substring(str.length()-n);
        return res;
    }
}
