package code.codingbat.ap1;

/**
 * Given a positive int n, return true if it contains a 1 digit.
 * Note: use % to get the rightmost digit, and / to discard the rightmost digit.

 * hasOne(10) → true
 * hasOne(22) → false
 * hasOne(220) → false
 */

class HasOne {
    public static void main(String[] args) {
        System.out.println(hasOne(10));
        System.out.println(hasOne(22));
        System.out.println(hasOne(220));
    }

    public static boolean hasOne(int n) {
        int ones = n % 10;
        int tens = (n / 10) % 10;
        int hundreds = (n / 100) % 10;
        return ones == 1 || tens == 1 || hundreds == 1;
    }
}
