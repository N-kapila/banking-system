package V1;

public class Depositor {
    double accountBalanceNew;
    double depositAmount;

    public Depositor(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double depositMoney(double accountBalance){
        accountBalanceNew = depositAmount+ accountBalance;
        System.out.println("You have succusfuly deposit.");
        return accountBalanceNew;
    }
}
