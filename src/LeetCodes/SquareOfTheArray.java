package LeetCodes;

import java.util.Arrays;

public class SquareOfTheArray {
    public static void main(String[] args) {
        sortedSquares(new int[]{-4,-1,0,3,10});
    }

    public static int[] sortedSquares(int[] nums) {
        int[] newArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
