package RemiLove;

import java.util.Scanner;

public class ScoreCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] scores = new int[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
            sum += scores[i];
        }
        double average = (double) sum / scores.length;

        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        System.out.println("Average score: " + average);
    }
}
