//Write an application that prompts the user to enter a year and uses a
//method called isLeapYear to check whether it is a leap year.
package chapterSix;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year to check if its a leap year: ");
        int input = scanner.nextInt();
    }
}
