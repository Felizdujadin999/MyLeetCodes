package chapterFour;

import java.util.Scanner;

public class DecimalEquivalentOfABinaryNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a binary integer(0 and 1 only):: ");
        String binary = input.nextLine();

        int decimal = 0;
        int position = 1;

        for (int i = binary.length()-1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(binary.charAt(i)));
            decimal += digit * position;
            position *= 2;
        }
        System.out.println("Decimal equivalent: " + decimal);
    }
}
