package V1;

public class TransactionFinder {
    String transaction;

    public String getTransaction() {
        return transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public void  printPreviousTransaction(){
        System.out.println("your previous transaction is: \n");
        System.out.println(transaction);
    }
}
