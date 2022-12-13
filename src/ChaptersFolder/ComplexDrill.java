package ChaptersFolder;

import java.util.Scanner;

public class ComplexDrill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double digit = input.nextDouble();
        double count = 1;
        double division = 0;
        double total;
        int numerator = 0;
        int denominator = 1;
        while (count <= digit) {
            denominator *= count;
            total = 1 / count;
            division += total;
            count++;
        }
        count = 1;
        while (count <= digit) {
            numerator += denominator / count;
            count++;
        }
        System.out.println("The answer in decimal is " + division);
        System.out.println("The answer in fraction is " + numerator + "/" + denominator);
        System.out.println("Thanks for using my small app..... ");
    }
}
