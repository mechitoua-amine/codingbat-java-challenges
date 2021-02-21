package code.codingbat.string2;

/**
 * Given two strings, word and a separator sep, return a big string made of count
 * occurrences of the word, separated by the separator string.

 * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
 * repeatSeparator("This", "And", 2) → "ThisAndThis"
 * repeatSeparator("This", "And", 1) → "This"
 */

class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String res = "";
        if (count == 0) return "";
        while (count > 1) {
            res += word + sep;
            count--;
        }
        return res + word;
    }
}
