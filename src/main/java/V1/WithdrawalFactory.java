package V1;

public class WithdrawalFactory {
    double withdrawAmount;
    double accountBalanceNew;

    public WithdrawalFactory(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public double withdrawMoney(double accountBalanceOld){
        if(accountBalanceOld<withdrawAmount) {
            System.out.println("Not enough money.");
        }else {
            accountBalanceNew= accountBalanceOld-withdrawAmount;
            return accountBalanceNew;
        }
        return accountBalanceOld;
    }
}

