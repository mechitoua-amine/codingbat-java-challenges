package code.codingbat.warmup2;

/**
 * Suppose the string "yak" is unlucky. Given a string,
 * return a version where all the "yak" are removed, but the "a" can be any char.
 * The "yak" strings will not overlap.

 * stringYak("yakpak") → "pak"
 * stringYak("pakyak") → "pak"
 * stringYak("yak123ya") → "123ya"
 */

public class StringYak {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ay"));
    }

    public static String stringYak(String str) {
        String result = "";
        // loop for i starting at "yak" -- advance i in that case
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                // otherwise do the normal append
                result += str.charAt(i);
            }
        }
        return result;
    }
}
