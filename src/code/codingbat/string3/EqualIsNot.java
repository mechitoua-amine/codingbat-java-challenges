package code.codingbat.string3;

/**
 * Given a string, return true if the number of appearances of "is"
 * anywhere in the string is equal to the number of appearances of "not"
 * anywhere in the string (case sensitive).
 *
 * equalIsNot("This is not") → false
 * equalIsNot("This is notnot") → true
 * equalIsNot("noisxxnotyynotxisi") → true
 */

public class EqualIsNot {
    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }

    public static boolean equalIsNot(String str) {
        int countIs = 0;
        int countNot = 0;
        str = str + "X";
        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+2).equals("is")) countIs++;
            if (str.substring(i,i+3).equals("not")) countNot++;
        }
        return countIs == countNot;
    }
}
