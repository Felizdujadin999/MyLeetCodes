package chapterThree;

public class CarApplication {
    public static void main(String[] args) {
        Car bmw = new Car("A5", "2021", 300000.00);
        Car toyota = new Car("camry", "2021", 900000.00);
        bmw.applyDiscount(10);
        toyota.applyDiscount(10);
        System.out.println(bmw.getPrice());
        System.out.println(toyota.getPrice());

    }
}
