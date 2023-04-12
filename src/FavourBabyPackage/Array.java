package FavourBabyPackage;

import java.security.SecureRandom;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        int[] number = {1,2,3,4,4,5,6,7,8,9};
//        int sum = 0;
//        for (int index = 0; index < number.length; index++) {
//            sum += number[index];
//        }
//        System.out.println("Total number in the array is: "+sum);
        SecureRandom secureRandom = new SecureRandom();
        int[] frequency = new int[7];
        for (int roll = 0; roll <=60_000_000; roll++) {
            ++frequency[1 + secureRandom.nextInt(6)];
        }
        System.out.printf("%s%10s%n", "Face", "Frequency");

        for (int face = 0; face < frequency.length; face++) {
            System.out.printf("4%d10%d%n", face, frequency[face]);
        }
    }
}
