package ChapterSeven;

import java.util.Arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] number = new int[3][];

        number[0] = new int[4];
        number[1] = new int[5];
        number[2] = new int[6];

        number[0][0] = 14;
        number[0][3] = 20;

        number[2][0] = 34;
        number[2][4] = 44;

        System.out.println(Arrays.deepToString(number));

        int [][] numbers = {{1,2,3,7}, {4,5}, {7}, {10,11,12}};

        for (int[] row : numbers) {
            System.out.println(Arrays.toString(row));
        }
    }
}
