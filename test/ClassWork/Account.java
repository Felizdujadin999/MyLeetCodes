package ChapterFive;

public class Account {
    private String name;
    private double balance;
    private double transfer;

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public String transfer(double amount){
        balance = balance - amount;
        return "successful";
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }
}
