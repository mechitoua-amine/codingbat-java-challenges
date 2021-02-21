package code.codingbat.string1;

/**
 * Given a string, if the first or last chars are 'x', return the string without
 * those 'x' chars, and otherwise return the string unchanged.
 * 
 * withoutX("xHix") → "Hi" withoutX("xHi") → "Hi" withoutX("Hxix") → "Hxi"
 */

class WithoutX {
	public static void main(String[] args) {
		System.out.println(withoutX("xHix"));
		System.out.println(withoutX("xHi"));
		System.out.println(withoutX("Hxix"));
	}

	public static String withoutX(String str) {
		if (str.length() == 0)
			return "";
		if (str.charAt(0) == 'x')
			str = str.substring(1);
		if (str.length() > 0 && str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);
		return str;
	}

	/*
	 * // Alternative solution if (str.length() > 0 && str.charAt(0) == 'x') str =
	 * str.substring(1); if (str.length() > 0 && str.charAt(str.length()-1) == 'x')
	 * str = str.substring(0, str.length()-1);
	 * 
	 * return str;
	 * 
	 * // Solution notes: check for the 'x' in both spots. If found, use substring()
	 * // to grab the part without the 'x'. Check that the length is greater than 0
	 * // each time -- the need for the second length check is tricky to see. // One
	 * could .substring() instead of .charAt() to look into the string.
	 */
}