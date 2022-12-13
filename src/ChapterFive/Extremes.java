//Write an application that finds the minimum and maximum amongst several
//integers and then computes the sum of the two extremes. The user will be prompted to input how
//many values the application should ask the user to input.
package ChapterFive;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        int sum = max + min;
        System.out.printf("The maximum number is %d%nThe minimum number is %d%nThe sum is %d%n", max, min, sum);
    }
}
