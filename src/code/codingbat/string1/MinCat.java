package code.codingbat.string1;

/**
 * Given two strings, append them together (known as "concatenation") and return
 * the result. However, if the strings are different lengths, omit chars from
 * the longer string so it is the same length as the shorter string. So "Hello"
 * and "Hi" yield "loHi". The strings may be any length.
 * 
 * minCat("Hello", "Hi") → "loHi" minCat("Hello", "java") → "ellojava"
 * minCat("java", "Hello") → "javaello"
 */

class MinCat {
	public static void main(String[] args) {
		System.out.println(minCat("Hello", "Hi"));
		System.out.println(minCat("Hello", "java"));
		System.out.println(minCat("java", "Hello"));
	}

	public static String minCat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		if (lenA == lenB)
			return a + b;

		if (lenA > lenB)
			return a.substring(a.length() - lenB) + b;
		else
			return a + b.substring(b.length() - lenA);
	}
}