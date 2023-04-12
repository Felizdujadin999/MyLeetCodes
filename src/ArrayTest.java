import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int [] [] numbers = new int[5][3];

        for (int [] row: numbers) {
            System.out.println(Arrays.toString(row));
        }
        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.println(numbers[row][column]);
            }
        }


//        int []numbers2 = new int[5];
//
//        for (int i = 0; i < numbers2.length; i++) {
//            numbers2[i] = i;
//        }
//        for (int i = 0; i < numbers2.length; i++) {
//            System.out.println(numbers2[i]);
//        }
//
//        for (int num : numbers2) {
//            System.out.println(num);
//        }

        System.out.println(Arrays.deepToString(numbers));
//        System.out.println(Arrays.toString(numbers2));
    }
}
