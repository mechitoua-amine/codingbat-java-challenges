package code.codingbat.string1;

/**
 * Given a string, if the string begins with "red" or "blue" return that color
 * string, otherwise return the empty string.
 * 
 * seeColor("redxx") → "red" seeColor("xxred") → "" seeColor("blueTimes") →
 * "blue"
 */

class SeeColor {
	public static void main(String[] args) {
		System.out.println(seeColor("redxx"));
		System.out.println(seeColor("xxred"));
		System.out.println(seeColor("blueTimes"));
	}

	public static String seeColor(String str) {
		if (str.startsWith("red"))
			return str.substring(0, 3);
		if (str.startsWith("blue"))
			return str.substring(0, 4);

		return "";
	}
}