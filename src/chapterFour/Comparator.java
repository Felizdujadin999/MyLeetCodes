//Write an application that works as a comparator. Your program
//should read two numbers from the user and print 0 if they are equal to each other, 1 if the first
//number is greater, and –1 if the second number is greater.
package chapterFour;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();
        if (firstNumber == secondNumber){
            System.out.println("0");
        }
        if (firstNumber > secondNumber){
            System.out.println("1");
        }
        if (firstNumber < secondNumber){
            System.out.println("-1");
        }
        System.out.println("THanks for using my small app.....");
    }
}
