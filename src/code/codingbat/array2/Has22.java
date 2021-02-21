package code.codingbat.array2;

/**
 * Given an array of ints, return true if the array contains a 2 next to a 2 somewhere.
 *
 * has22([1, 2, 2]) → true
 * has22([1, 2, 1, 2]) → false
 * has22([2, 1, 2]) → false
 */
public class Has22 {
    public static void main(String[] args) {
        System.out.println(has22(1,2,2));
        System.out.println(has22(1,2,1,2));
        System.out.println(has22(2,1,2));
    }

    public static boolean has22(int... nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == 2 && nums[i] == nums[i+1])
                flag = true;
        }
        return flag;
    }
}
