package code.codingbat.string2;

/**
 * Return a version of the given string, where for every star (*) in the string the star
 * and the chars immediately to its left and right are gone.
 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
 *
 * starOut("ab*cd") → "ad"
 * starOut("ab**cd") → "ad"
 * starOut("sm*eilly") → "silly"
 */

public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));
    }

    public static String starOut(String str) {
        while (str.indexOf('*') != -1) {
            if (str.equals("*")) return "";
            int starPos = str.indexOf('*');
            int secondStar = str.indexOf('*', starPos+1);
            if (secondStar - starPos == 1) {
                str = str.substring(0,starPos) + str.substring(secondStar);
                continue;
            }
            if (starPos == 0) str = str.substring(starPos+2);
            else if (starPos == str.length()-1)
                str = str.substring(0, str.length()-2);
            else str = str.substring(0, starPos-1) + str.substring(starPos+2);
        }
        return str;
    }
}
