package code.codingbat.logic2;

/**
 * Given 3 int values, a b c, return their sum. However, if one of the values is the same
 * as another of the values, it does not count towards the sum.

 * loneSum(1, 2, 3) → 6
 * loneSum(3, 2, 3) → 2
 * loneSum(3, 3, 3) → 0
 */
public class LoneSum {

	public static void main(String[] args) {
		System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
	}

	public static int loneSum(int a, int b, int c) {
        if (a == b && b == c && c == a) return 0;
        if (a == b) return c;
        if (a == c) return b;
        if (b == c) return a;
        return a + b + c;
	}

    /*
        Alternative solution:
        public int loneSum(int a, int b, int c) {
            int sum = 0;
            if (a != b && a != c) {
                sum += a;
            }
            if (b != a && b != c) {
                sum += b;
            }
            if (c != a && c != b) {
                sum += c;
            }
            return sum;

            // Solution notes: this code is a pretty direct translation
            // of the problem statement.
            // For each of a/b/c, check that it is different from
            // the other two before adding it to the sum variable
        }
     */
}
