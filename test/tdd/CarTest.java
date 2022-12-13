package tdd;

import chapterThree.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarTest {
    @Test
    public void TestThatCarCanBeCreated() {
        Car benz = new Car("G-990", "2022", 50.00);
        assertNotNull(benz);
    }

    @Test
    public void TestThatCarsAttributesAreInitialised() {
        Car benz = new Car("G-990", "2022", 50.00);
        assertEquals("G-990", benz.getModel());
        assertEquals("2022", benz.getYear());
        assertEquals(50.00, benz.getPrice());
    }

    @Test
    public void TestThatOnlyPositiveAmountAreAllowedAsCarPrice() {
        Car benz = new Car("G-990", "2022", 50.00);
        benz.setPrice(-2000000);
        assertEquals(45.00, benz.getPrice());
    }

    @Test
    public void DiscountTest() {
        Car benz = new Car("G-990", "2022", 100.00);
        benz.applyDiscount(10);
        assertEquals(90.0, benz.getPrice());
    }

    @Test
    public void setPriceAppliesTest() {
        Car benz = new Car("G-990", "2022", 100.00);
        benz.setPrice(1000.00);
        assertEquals(900.0, benz.getPrice());
    }
}