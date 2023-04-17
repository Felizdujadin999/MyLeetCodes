package LeetCodes;
import java.util.Arrays;

public class LCMOfANumber {
    public static void main(String[] args) {
        System.out.println(findLcm(new int[]{2, 4, 6}));
    }

    public static int findLcm(int[] num) {
        int max = Integer.MIN_VALUE;
        int divisor = 2;
        for (var each: num) if(each > max) max = each;
        int lcm= 1;
        while (divisor < max){
            int count = 0;
            for (int i = 0; i < num.length; i++) {
                if (num[i] % divisor == 0){
                    num[i]/=divisor;
                    count++;
                }
            }
            if (count==0) divisor++;
            else lcm*=divisor;
        }
        return lcm;
    }
}

