package chapterOne;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int counter;
        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Enter Grade: ");
            int grade = input.nextInt();
            sum = sum + grade;
        }
        int average = sum / counter;
        System.out.println("The average score is: " + average);
    }
}
