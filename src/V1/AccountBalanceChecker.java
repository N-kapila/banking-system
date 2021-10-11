package V1;

import java.text.NumberFormat;

public class AccountBalanceChecker {
    NumberFormat currency = NumberFormat. getCurrencyInstance();
    double accountBalance;

    public AccountBalanceChecker(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double chekAccountBalance(){
        System.out.println("Your account balance is: "+currency.format(accountBalance));
        return accountBalance;
    }
}
