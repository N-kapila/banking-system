package V1;

public class Account {
    long accountNumber;
    String accountHolder;
    double accountBalance=00.00;

    public Account(long accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        System.out.println("Start your journey...!");
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
