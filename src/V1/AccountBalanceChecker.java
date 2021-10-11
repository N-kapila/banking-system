package V1;

public class AccountBalanceChecker {
    double accountBalance;

    public AccountBalanceChecker(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double chekAccountBalance(){
        System.out.println("Your account balance is: "+accountBalance);
        return accountBalance;
    }
}
