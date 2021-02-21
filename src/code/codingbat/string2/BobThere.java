package code.codingbat.string2;

/**
 * Return true if the given string contains a "bob" string,
 * but where the middle 'o' char can be any char.

 * bobThere("abcbob") → true
 * bobThere("b9b") → true
 * bobThere("bac") → false
 */

class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));
    }

    public static boolean bobThere(String str) {
        if (str.length() >= 3) {
            for (int i = 0; i < str.length()-2; i++) {
                if (str.charAt(i) == 'b' && str.charAt(i+2) == 'b')
                    return true;
            }
        }
        return false;
    }
}
