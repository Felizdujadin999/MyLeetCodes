package AccountFolder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account tyAccount;
    @BeforeEach
    public void startWithThis(){
        tyAccount = new Account(1, "Felix", "1234");
    }
    @Test
    public void depositMoneyTest(){
        tyAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), tyAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithCorrectPinTest(){
        tyAccount.deposit(BigDecimal.valueOf(2000));
        assertEquals(BigDecimal.valueOf(2000), tyAccount.getBalance("1234"));
    }
    @Test
    public void getBalanceWithWrongPinThrowsExceptionTest(){
        tyAccount.deposit(BigDecimal.valueOf(2000));
        assertThrows(IllegalArgumentException.class, ()->tyAccount.getBalance("2244"));
    }
    @Test
    public void withdrawMoneyTest(){
        tyAccount.deposit(BigDecimal.valueOf(8000));
        tyAccount.withdraw(BigDecimal.valueOf(2000), "1234");
        assertEquals(BigDecimal.valueOf(6000), tyAccount.getBalance("1234"));
    }
    @Test
    public void withdrawMoneyBelowZeroTest(){
        tyAccount.deposit(BigDecimal.valueOf(8000));
        tyAccount.withdraw(BigDecimal.valueOf(7999), "1234");
        assertEquals(BigDecimal.valueOf(1), tyAccount.getBalance("1234"));
    }
    @Test
    public void withdrawWithWrongPinThrowsExceptionTest(){
        //tyAccount.deposit(BigDecimal.valueOf(2000));
        System.out.println(tyAccount.toString());
        assertThrows(IllegalArgumentException.class, ()->tyAccount.withdraw(BigDecimal.valueOf(5000),"1235"));
    }
}