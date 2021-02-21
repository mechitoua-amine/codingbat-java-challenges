package code.codingbat.string1;

/**
 * Given a string of any length, return a new string where the last 2 chars, if
 * present, are swapped, so "coding" yields "codign".
 * 
 * lastTwo("coding") → "codign" lastTwo("cat") → "cta" lastTwo("ab") → "ba"
 */

class LastTwo {
	public static void main(String[] args) {
		System.out.println(lastTwo("coding"));
		System.out.println(lastTwo("cat"));
		System.out.println(lastTwo("ab"));
	}

	public static String lastTwo(String str) {
		if (str.length() < 2)
			return str;
		if (str.length() == 2)
			return str.charAt(1) + "" + str.charAt(0);

		return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
	}
}
