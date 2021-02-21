package code.codingbat.string2;

/**
 * @author mehmet Emin
 * A sandwich is two pieces of bread with something in between. 
 * Return the string that is between the first and last appearance 
 * of "bread" in the given string, or return the empty string "" 
 * if there are not two pieces of bread.

 * getSandwich("breadjambread") → "jam"
 * getSandwich("xxbreadjambreadyy") → "jam"
 * getSandwich("xxbreadyy") → ""
 */

class GetSandwich {

	public static void main(String[] args) {
		System.out.println(getSandwich("breadjambread"));
		System.out.println(getSandwich("xxbreadjambreadyy"));
		System.out.println(getSandwich("xxbreadyy"));
	}
	
	public static String getSandwich(String str) {
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");
		if (first == last) return "";
		return 	str.substring(first+5,last);
	}

}
