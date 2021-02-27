package code.codingbat.string1;

/**
 * Given a string, return true if the first 2 chars in the string also appear at
 * the end of the string, such as with "edited".
 * 
 * frontAgain("edited") -> true
 * frontAgain("edit") -> false
 * frontAgain("ed") -> true
 */

class FrontAgain {
	public static void main(String[] args) {
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
	}

	public static boolean frontAgain(String str) {
		if (str.length() < 2)
			return false;
		String firstTwo = str.substring(0, 2);
		String lastTwo = str.substring(str.length() - 2);
		return firstTwo.equals(lastTwo);
	}
}
