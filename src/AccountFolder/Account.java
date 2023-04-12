package AccountFolder;

import java.math.BigDecimal;

public class Account {
    private String pin;
    private String accountName;
    private int accountNumber;
    private BigDecimal balance = BigDecimal.ZERO;

   public Account(int accountNumber, String accountName, String accountPin){
        pin = accountPin;
        this.accountNumber = accountNumber;
        this.accountName = accountName;
    }

    public BigDecimal getBalance(String pin) {
       if(!pin.equals(this.pin))throw new IllegalArgumentException("Invalid Pin, Try again......");
       return balance;
    }

    public void deposit(BigDecimal amount) {
       balance = balance.add(amount);
    }

    public BigDecimal withdraw(BigDecimal amount, String pin) {
       if(!pin.equals(this.pin))throw new IllegalArgumentException("Invalid pin....");
       else if ((balance.subtract(amount)).equals(BigDecimal.ZERO))throw new IllegalArgumentException("Insufficient balance.....");
       else
        balance = balance.subtract(amount);
       return balance;
    }

    @Override
    public String toString(){
       return String.format("""
                ==========================
                Account Name: %s
                Account Number: %s
                Account Balance: %s
                ==========================""", accountName, accountNumber, balance.toPlainString());
    }
}
