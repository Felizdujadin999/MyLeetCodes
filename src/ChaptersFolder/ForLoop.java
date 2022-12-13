package ChaptersFolder;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Grade score = new Grade();
        int sum = 0;
        int counter= 0;
        for (counter = 1; counter <= 10; counter++) {
            System.out.printf("Enter %s grade: ",score.numberOfGrade(counter));
            int grade = input.nextInt();

            sum = sum + grade;
         }
        int average = sum / 10;
        System.out.println("The sum score is: " + sum);
        System.out.println("The average score is: " + average);
        System.out.println("Thanks for using my small app. ");
    }


}
