package code.codingbat.recursion;

/**
 * Given a string, compute recursively a new string where all the
 * adjacent chars are now separated by a "*".
 *
 *  allStar("hello") → "h*e*l*l*o"
 *  allStar("abc") → "a*b*c"
 *  allStar("ab") → "a*b"
 */

class AllStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
    }

    public static String allStar(String str){
        if (str.length() < 2) return str;
        return str.charAt(0)+ "*" + allStar(str.substring(1));
    }
}
