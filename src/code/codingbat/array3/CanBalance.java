package code.codingbat.array3;

/**
 * Given a non-empty array, return true if there is a place to split the array
 * so that the sum of the numbers on one side is equal to the sum of the numbers
 * on the other side.
 *
 * canBalance([1, 1, 1, 2, 1]) → true
 *
 * canBalance([2, 1, 1, 2, 1]) → false
 *
 * canBalance([10, 10]) → true
 */

class CanBalance {
    public static void main(String[] args) {
        System.out.println(canBalance(1, 1, 1, 2, 1));
        System.out.println(canBalance(2, 1, 1, 2, 1));
        System.out.println(canBalance(10, 10));
    }

    public static boolean canBalance(int... nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++)
                sum += nums[j];
            for (int j = i; j < nums.length; j++)
                sum -= nums[j];
            if (sum == 0)
                return true;
        }
        return false;
    }
}