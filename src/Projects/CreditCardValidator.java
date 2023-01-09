package Projects;

import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello esteemed customer, kindly enter card number to verify: ");
        String input = scanner.nextLine();
        char[] index = input.toCharArray();
        int length = input.length();

        int first = 0;
        int second = 0;
        int firstAnswer;
        int secondAnswer = 0;
        int response;
        System.out.println("**********************************************************************");
        if (length >= 13 && length <= 16){
            if (((index[0]) - 48) == 4){
                System.out.println("**Credit card type: Visa Card");
            } else if (((index[0]) - 48) == 5){
                System.out.println("**Credit card type: MasterCard");
            } else if (((index[0])- 48) == 37){
                System.out.println("**Credit card type: American Express Card");
            } else if (((index[0])- 48) == 6){
                System.out.println("**Credit card type: Discover Card");
            } else
                System.out.println("**Credit card type: Invalid Card");
            System.out.printf("**Credit Card Number: %s%n", input);
            System.out.printf("**Credit Card Digit Length: %s%n", length);
            for (int i = 0; i < length; i+=2) {
                if (((index[i] - 48) * 2) > 9){
                    first = first + ((index[i] - 48) * 2 % 10) + 1;
                }
                if (((index[i] - 48) * 2) < 9){
                    second += (index[i] - 48) * 2;
                }
            }

            for (int i = 1; i < length; i+=2) {
                secondAnswer += (index[i] - 48);
            }
            firstAnswer = first + second;
            response = firstAnswer + secondAnswer;

            if (response % 10 == 0){
                System.out.println("**Credit Card Validity: Valid");
            }else System.out.println("**Credit Card Validity: Invalid");
            System.out.println("**********************************************************************");
            System.out.println("Thanks for using my application....................................");
        }
        else System.out.println("Try again esteemed customer...........");
    }
}
