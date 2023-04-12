package AccountFolder;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank kuda;
    @BeforeEach
    public void startEachTestWith(){
        kuda = new Bank();
        kuda.createAccountFor("Felix", "Ezeike", "1234");
    }

    @Test
    public void accountCanBeCreatedInBankTest(){
        assertEquals(1, kuda.getNumberOfCustomers());
    }

    @Test
    public void accountCanBeFoundAfterCreationTest(){
        String expected = """
                ==========================
                Account Name: Felix Ezeike
                Account Number: 1
                Account Balance: 0
                ==========================""";
        assertEquals(expected, kuda.findAccount(1).toString());
    }

    @Test
    public void  balanceCanBeChecked(){
        // assertEquals("0", kuda.checkBalanceFor(1,"1234").toPlainStrings)
        assertEquals(BigDecimal.ZERO, kuda.checkBalanceFor(1, "1234"));
    }

    @Test
    public void depositTest(){
        kuda.depositInto(1, BigDecimal.valueOf(50));
        assertEquals(BigDecimal.valueOf(50), kuda.checkBalanceFor(1, "1234"));
    }

    @Test
    public void withdrawTest(){
        kuda.depositInto(1, BigDecimal.valueOf(50));
        kuda.withdrawFrom(1, BigDecimal.valueOf(20), "1234");
        assertEquals(BigDecimal.valueOf(30), kuda.checkBalanceFor(1, "1234"));
    }

    @Test
    public void transferMoneyTest(){
        kuda.createAccountFor("All", "Well", "1234");
        kuda.depositInto(2, BigDecimal.valueOf(5000));

        kuda.transfer(BigDecimal.valueOf(2000), 2, 1, "1234");

        assertEquals(BigDecimal.valueOf(2000), kuda.checkBalanceFor(1, "1234"));
        assertEquals(BigDecimal.valueOf(3000), kuda.checkBalanceFor(2, "1234"));
    }

    @Test
    public void deleteAccount(){
        kuda.deleteAccountFor("Felix", "Ezeike", 1);
        String expected = """
                ==========================
                Account Name: null
                Account Number: 1
                Account Balance: 0
                ==========================""";
        assertEquals(expected, kuda.findAccount(1).toString());
    }

    @Test
    public void testCheckAccountInfo(){
        kuda.checkAccountInfo(1);
    }
}
