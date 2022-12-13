package ChapterFive;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int userInput = input.nextInt();

        int blank =(userInput - 1)/2;
        for (int increase = 1; increase <= userInput; increase+=2) {
            for (int space = 0; space < blank; space++) {
                System.out.print(" ");
            }

            for (int diamond = 1; diamond <= increase;  diamond++) {
                System.out.print("*");
            }
            System.out.println();
            blank--;
        }
        blank = 1;
        for (int increase = userInput-2; increase >= 1; increase-=2) {
            for (int space = 1; space <= blank; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=increase; j++) {
                System.out.print("*");
            }
            System.out.println();
            blank++;
        }
    }
}