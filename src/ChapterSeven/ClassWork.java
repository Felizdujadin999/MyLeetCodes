package ChapterSeven;

import java.util.Arrays;

public class ClassWork {
    public static void main(String[] args) {
        int[][] number = new int[3][3];

        number[0][0] = 1;
        number[0][1] = 2;
        number[0][2] = 3;
        number[1][0] = 4;
        number[1][1] = 5;
        number[1][2] = 6;
        number[2][0] = 7;
        number[2][1] = 8;
        number[2][2] = 9;

        for (int[] rows:number) {
            System.out.println(Arrays.toString(rows));
        }
    }
}
