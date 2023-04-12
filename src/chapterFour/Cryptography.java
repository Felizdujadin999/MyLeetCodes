package chapterFour;

import java.util.Arrays;
import java.util.Scanner;

public class Cryptography {
    static int[] yetEncryptedNumber = new int[4];
    static int[] decryptedNumber = new int[4];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digits: ");
        String number = scanner.next();
        encryption(number);
        decryption(number);
    }

    public static void encryption(String number) {
        for (int i = 0; i < yetEncryptedNumber.length; i++) {
            yetEncryptedNumber[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        for (int digit = 0; digit < yetEncryptedNumber.length; digit++) {
            decryptedNumber[digit] = (yetEncryptedNumber[digit] + 7) % 10;
        }
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        for (int i = 0; i < decryptedNumber.length; i++) {
            if (i == 0) {firstNumber = decryptedNumber[i];}
            if (i == 1) {secondNumber = decryptedNumber[i];}
            if (i == 2) {thirdNumber = decryptedNumber[i];}
            if (i == 3) {fourthNumber = decryptedNumber[i];}
        }
        for (int j = 0; j < decryptedNumber.length; j++) {
            if (j == 0) {decryptedNumber[j] = thirdNumber;}
            if (j == 1) {decryptedNumber[j] = fourthNumber;}
            if (j == 2) {decryptedNumber[j] = firstNumber;}
            if (j == 3) {decryptedNumber[j] = secondNumber;}
        }
        System.out.println(Arrays.toString(yetEncryptedNumber));
        System.out.println(Arrays.toString(decryptedNumber));
    }

    public static void decryption(String digit) {
        for (int i = 0; i < yetEncryptedNumber.length; i++) {
            yetEncryptedNumber[i] = Integer.parseInt(String.valueOf(digit.charAt(i)));
        }
        for (int digits = 0; digits < yetEncryptedNumber.length; digits++) {
            decryptedNumber[digits] = (yetEncryptedNumber[digits] * 10) + 7;
        }
        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        for (int i = 0; i < decryptedNumber.length; i++) {
            if (i == 0) {firstNumber = decryptedNumber[i];}
            if (i == 1) {secondNumber = decryptedNumber[i];}
            if (i == 2) {thirdNumber = decryptedNumber[i];}
            if (i == 3) {fourthNumber = decryptedNumber[i];}
        }
        for (int j = 0; j < decryptedNumber.length; j++) {
            if (j == 0) {decryptedNumber[j] = thirdNumber;}
            if (j == 1) {decryptedNumber[j] = fourthNumber;}
            if (j == 2) {decryptedNumber[j] = firstNumber;}
            if (j == 3) {decryptedNumber[j] = secondNumber;}
        }
       // System.out.println(Arrays.toString(yetEncryptedNumber));
        System.out.println(Arrays.toString(decryptedNumber));
    }
}
