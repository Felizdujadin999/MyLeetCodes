package LeetCodes;

import java.util.Arrays;

public class ReshuffleArray {
    public static void main(String[] args) {
        int[] array = {10, 12, 3, 4};
        int[] newArray = new int[array.length];

        //One way to do it.
        for (int i = 0; i < array.length; i++) {
            int number = array.length-(i+1);
            newArray[i] = array[number];}
        System.out.println(Arrays.toString(newArray));

        //Another way to do it.
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            newArray[k] = array[i];
            k++;
        }
        System.out.println(Arrays.toString(newArray));
    }

}
