//Create a class called PetrolPurchase to represent information
//about the petrol you purchase. The class should include five pieces of information in the form of
//instance variables—the station’s location (type String), the type of petrol (type String),
// the quantity (type int) of the purchase in liters, the price per liter (double), and the percentage discount (double).
//Your class should have a constructor that initializes the five instance variables. Provide a
//set and a get method for each instance variable. In addition,
// provide a method named getPurchaseAmount that calculates the net purchase amount
// (i.e., multiplies the quantity by the price per liter)
//minus the discount, then returns the net amount you had to pay as a double value.
// Write an application class named Petrol that demonstrates the capabilities of class PetrolPurchase
package chapterThree;

import java.util.Scanner;

public class PetrolPurchase {
private String location;
private String petrolType;
private int quantityInLiters;
private int pricePerLitre;
private double percentageDiscount;

    public PetrolPurchase(String location, String petrolType, int quantityInLiters, int pricePerLitre, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantityInLiters = quantityInLiters;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }
    Scanner input = new Scanner(System.in);

    public void setLocation(String location) {
        System.out.println("Enter petrol location: ");
        this.location = input.nextLine();
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        System.out.println("Enter petrol type: ");
        this.petrolType = input.nextLine();
    }

    public int getQuantityInLiters() {
        return quantityInLiters;
    }

    public void setQuantityInLiters(int quantityInLiters) {
      //  System.out.println("Enter quantity purchased in litres: ");
        // this.quantityInLiters = input.nextInt();
        this.quantityInLiters = quantityInLiters;
    }

    public int getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(int pricePerLitre) {
        System.out.println("Enter price in litres: ");
        this.pricePerLitre = input.nextInt();
    }

    public double getPercentageDiscount() {
        double amount = 0;
        return percentageDiscount / 100 * amount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        System.out.println("Enter percentage discount: ");
        this.percentageDiscount = input.nextDouble();
    }
    public double getPurchaseAmount(){
        int amount = quantityInLiters * pricePerLitre;
        return (amount) - (percentageDiscount/100 * amount);
    }

}
