package LeetCodes;

import java.util.Arrays;
import java.util.List;

public class HighestCommonFactor {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(factors(1000)));
    }

//    public static List<Integer> highestCommonFactor(int num, int... args){
//
//    }
    public static int[] factors(int num){
        int count = 0;
        int[] factors = new int[num];
        int divider = 2;
        while (num > 1) {
            if (num % divider == 0) {
                num /= divider;
                factors[count] = divider;
                count++;
            } else divider++;
        }
        return Arrays.copyOf(factors, count);
    }
}
