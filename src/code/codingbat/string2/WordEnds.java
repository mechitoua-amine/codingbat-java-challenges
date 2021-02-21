package code.codingbat.string2;

/**
 * Given a string and a non-empty word string, return a string made of each char
 * just before and just after every appearance of the word in the string.
 * Ignore cases where there is no char before or after the word, and a char may be
 * included twice if it is between two words.

 * wordEnds("abcXY123XYijk", "XY") → "c13i"
 * wordEnds("XY123XY", "XY") → "13"
 * wordEnds("XY1XY", "XY") → "11"
 */

class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        String res = "";
        int wordIndex = str.indexOf(word);
        while (wordIndex != -1) {
            if (wordIndex != 0) res += str.charAt(wordIndex-1);
            if (wordIndex + word.length() == str.length()) break;
            res += str.charAt(wordIndex + word.length());
            wordIndex = str.indexOf(word, wordIndex+1);
        }
        return res;
    }
}
