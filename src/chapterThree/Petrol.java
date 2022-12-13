package chapterThree;

import java.util.Scanner;

public class Petrol {
    public static void main(String[] args) {
        PetrolPurchase petrol = new PetrolPurchase("Lagos", "Diesel", 2, 200, 10.0);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity to purchase: ");
        int quantity = scanner.nextInt();
        petrol.setQuantityInLiters(quantity);

        System.out.println();
        System.out.printf("This petrol station´s is located at %s%n", petrol.getLocation());
        System.out.printf("The type of petrol purchased is %s%n", petrol.getPetrolType());
        System.out.printf("The quantity purchased is %d%n", petrol.getQuantityInLiters());
        System.out.printf("The price per litre is %d%n", petrol.getPricePerLitre());
        System.out.printf("The percentage discount is %.2f%n",petrol.getPurchaseAmount());
        //System.out.printf("net cost is %.2f%n",petrol.getPurchaseAmount() );
    }
}
