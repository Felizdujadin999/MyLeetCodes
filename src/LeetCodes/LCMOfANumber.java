package LeetCodes;
import java.util.Arrays;

public class LCMOfANumber {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(findHCF(10)));
        System.out.println(Arrays.toString(findFactors(0)));
    }

//    public static int[] findHCF(int num) {
//        List<Integer> factors = new ArrayList<>();
//        for (int divider = 2; divider < num; divider++) {
//            if (num % divider == 0) {
//                factors.add(divider);
//                System.out.println(divider);
//            }
//        }
//        int[] factorArray = new int[factors.size()];
//        for (int i = 0; i < factorArray.length; i++) {
//            factorArray[i] = factors.get(i);
//        }
//        return factorArray;
//    }

    public static int[] findFactors(int num) {
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

