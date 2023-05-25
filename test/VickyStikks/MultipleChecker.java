package VickyStikks;

import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        int tripled = num1 * 3;
        int doubled = num2 * 2;

        if (tripled % doubled == 0) {
            System.out.println("The first number tripled is a multiple of the second number doubled.");
        } else {
            System.out.println("The first number tripled is not a multiple of the second number doubled.");
        }
    }
}

