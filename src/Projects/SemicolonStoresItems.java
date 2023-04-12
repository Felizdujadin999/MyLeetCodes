package Projects;

public class SemicolonStoresItems {
    private String itemName;
    private int itemPrice;
    private int itemAmount;
    private double totalPrice;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemAmount() {
        return itemAmount;
    }

    public SemicolonStoresItems(String itemName, int itemPrice, int itemAmount, double totalPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemAmount = itemAmount;
        this.totalPrice = totalPrice;
    }

    public void display() {
        System.out.printf("  %9s    %7d    %9.2f    %12.2f\n", itemName, itemAmount, itemPrice, totalPrice);
    }
}
