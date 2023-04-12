package chapterFour;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter name of citizen " + i + ": ");
            String name = input.nextLine();

            System.out.print("Enter earnings of citizen " + i + " in a year: ");
            double earnings = input.nextDouble();
            input.nextLine();

            double tax;
            if (earnings <= 30000) {
                tax = earnings * 0.15;
            } else {
                tax = 30000 * 0.15 + (earnings - 30000) * 0.20;
            }
            System.out.println(name + "'s total tax: $" + tax);
        }
    }
}