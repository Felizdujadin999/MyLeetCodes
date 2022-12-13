package ChapterSeven;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //int [] numbers = new int[10];
//        System.out.println(Arrays.toString(numbers));
//        numbers[0] = 9;
//        numbers[4] = 10;
//        numbers[9] = 100;
//        numbers[4] = 29;
//        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many scores u wan add?: ");
        int numberOfScores = scanner.nextInt();
        int [] scores = new int[numberOfScores];
        int sum = 0;

        for (int index = 0; index < numberOfScores; index++) {
            System.out.println("Enter score "+ (index+1)+":");
            scores[index] = scanner.nextInt();
        }
        for (int index = 0; index < scores.length; index++) {
            sum+=scores[index];
        }
        System.out.println("Sum of scores is "+sum);
    }
}
