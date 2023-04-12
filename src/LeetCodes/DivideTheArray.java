package LeetCodes;

import java.util.Arrays;

public class DivideTheArray {
    public static void main(String[] args) {
        divideArray(new int[]{2,2,3,3,4,4});
    }

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length / 2;
        for (int i = 0; i < n; i++) {
            if (nums[2 * i] != nums[2 * i + 1]) {
                return false;
            }
        }
        return true;
    }

}
