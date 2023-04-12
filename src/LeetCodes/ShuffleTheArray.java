package LeetCodes;

import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] num = {2,5,1,3,4,7};
        shuffle(num, 3);
    }

    public static int[] shuffle(int[] nums, int n){
        int[] result = new int[nums.length];

        for (int i = 0; i < n; i++) {
            result[i*2] = nums[i];
        }

        for (int j = 1; j < n+1; j++) {
            result[(j*2)-1] = nums[n+j-1];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
