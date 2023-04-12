package chapterFour;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter salesperson's name: ");
        String name = input.nextLine();

        System.out.print("Enter number of items sold: ");
        double numItems = input.nextDouble();

        double totalSales=0;
        for (int i = 1; i <= numItems; i++) {
            System.out.print("Enter value of item " + i + ": ");
            double itemValue = input.nextDouble();
            totalSales += itemValue;
        }

        double commission = totalSales * 0.09;
        double earnings = 200 + commission;

        System.out.println("==============================");
        System.out.println("| Salesperson's name: " + name +"|");
        System.out.println("==============================");
        System.out.println("|Total sales: $" + totalSales +"|");
        System.out.println("==============================");
        System.out.println("|Commission: $" + commission +"|");
        System.out.println("==============================");
        System.out.println("|Earnings: $" + earnings +"|");
        System.out.println("==============================");
    }
}
