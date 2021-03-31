package code.codingbat.recursion;

/**
 * Count recursively the total number of "abc" and "aba" substrings
 * that appear in the given string.
 *
 * countAbc("abc") → 1
 * countAbc("abcxxabc") → 2
 * countAbc("abaxxaba") → 2
 */

class CountAbc {
    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
    }

    public static int countAbc(String str) {
        return 0;
    }
}
