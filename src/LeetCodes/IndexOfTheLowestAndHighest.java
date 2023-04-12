package LeetCodes;

import java.util.Arrays;

public class IndexOfTheLowestAndHighest {
    public static void main(String[] args) {
        int[] nums = {5,9,12,12};
        System.out.println(Arrays.toString(returnIndex(nums)));
    }

    public static int[] returnIndex(int[] arr) {
        //int[] sums = new int[arr.length];
        int minimumIndex = 0;
        int maximumIndex = 0;
        int maximumSum = Integer.MAX_VALUE;
        int minimumSum = Integer.MIN_VALUE;
        for (int index = 0; index < arr.length; index++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (index != j) {
                    sum += arr[j];
                }
            }
           // sums[index] = sum;

            if (sum < minimumSum) {
                minimumSum = sum;
                minimumIndex = index;
            }
            if (sum > maximumSum) {
                maximumSum = sum;
                maximumIndex = index;
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        //System.out.println("Sums: " + Arrays.toString(sums));
        return new int[]{maximumIndex, minimumIndex};
    }
}
