package Projects;

import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonStores {
    private ArrayList<SemicolonStoresItems> semicolonStoresClasses; 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.println("What is the customers name?: ");
            input = scanner.nextLine();
            System.out.println("What did the customer buy?: ");
            input = scanner.nextLine();
            System.out.println("How many pieces?: ");
            input = scanner.nextLine();
            System.out.println("How much per unit?: ");
            input = scanner.nextLine();
            System.out.println("Add more items?: ");
            input = scanner.nextLine();
        } while (input.equalsIgnoreCase("yes"));
    }
}