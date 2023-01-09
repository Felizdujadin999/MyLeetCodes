package ChapterSeven;

import java.util.Arrays;

public class ClassWorkTwo {
    public static void main(String[] args) {
        int[][] number = new int[3][3];
        int numbers = 1;
        for (int outerArray = 0; outerArray < number.length; outerArray++) {
            for (int innerArray = 0; innerArray < 3; innerArray++) {
                number[outerArray][innerArray] = numbers;
                numbers++;
            }
        }
        System.out.println(Arrays.deepToString(number));
    }
}
