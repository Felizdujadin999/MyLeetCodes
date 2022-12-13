package ClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testThatAccountExists(){
        Account kuda = new Account("Joshua", 0.00);
        kuda.getBalance();
        assertEquals(0.00, kuda.getBalance());
    }

    @Test
    public void testThatAccountCanReceiveMoney(){
        Account kuda = new Account("Joshua", 0.00);
        kuda.deposit(7000);
        kuda.getBalance();
        assertEquals(7000, kuda.getBalance());
    }

    @Test
    public void testThatAccountCanTransferMoney(){
        Account zenith = new Account("Felix", 50_000);
        zenith.deposit(50_000);
        zenith. getBalance();
        assertEquals(100_000, zenith.getBalance());
    }
}
