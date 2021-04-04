package code.codingbat.recursion;

/**
 *
 * Given a string that contains a single pair of parenthesis, compute recursively a new string
 * made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
 *
 *
 * parenBit("xyz(abc)123") → "(abc)"
 * parenBit("x(hello)") → "(hello)"
 * parenBit("(xy)1") → "(xy)"
 */

public class ParenBit {
    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
    }

    public static String parenBit(String str) {
        return "";
    }
}
