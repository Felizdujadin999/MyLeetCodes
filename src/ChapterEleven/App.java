package ChapterEleven;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(BigDecimal.valueOf(5000));
        try {
            account.withdraw(BigDecimal.valueOf(100_000));
        } catch (OleBalanceException e) {
            System.err.println("have sense");
            throw new RuntimeException(e);
        }
    }
}
