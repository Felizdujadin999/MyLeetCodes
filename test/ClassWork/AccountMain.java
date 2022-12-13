package tdd;

import ChapterFive.Account;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account joshua = new Account("Joshua", 200_000);
        Account spencer = new Account("Spencer", 5000);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter amount to transfer: ");
        double amountTransfer = input.nextDouble();

        spencer.deposit(amountTransfer);

        System.out.println("Amount Transferred " + joshua.transfer(amountTransfer) + "\n Spencer's new balance is: " + spencer.getBalance() +
                "\n Your current account Balance is: " + joshua.getBalance());
    }
}
