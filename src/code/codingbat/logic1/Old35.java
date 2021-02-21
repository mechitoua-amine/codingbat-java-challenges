package code.codingbat.logic1;

/**
 * Return true if the given non-negative number is a multiple of 3 or 5, but not
 * both. Use the % "mod" operator -- see Introduction to Mod
 * 
 * old35(3) → true old35(10) → true old35(15) → false
 */

class Old35 {
    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    public static boolean old35(int n) {
        if (n % 3 == 0)
            return n % 5 == 0 ? false : true;
        return true;
    }
}
