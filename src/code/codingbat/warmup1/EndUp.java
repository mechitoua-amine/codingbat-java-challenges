package code.codingbat.warmup1;

/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.

endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
public class EndUp {
    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("Hi there"));
        System.out.println(endUp("hi"));
    }

    public static String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        int last3Char = str.length() - 3;
        String first = str.substring(0, last3Char);
        String last = str.substring(last3Char).toUpperCase();
        return first + last;
    }

    /*
     * if (str.length() <= 3) return str.toUpperCase(); int cut = str.length() - 3;
     * String front = str.substring(0, cut); String back = str.substring(cut); //
     * this takes from cut to the end
     * 
     * return front + back.toUpperCase()
     */
}
