package V1;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatementPrint {
    DateFormat dateFormat = new SimpleDateFormat("dd/mm/yy");
    NumberFormat currency = NumberFormat. getCurrencyInstance();
    Date date;

    public void printStatement(long accountNumber, double accountBalance, String transaction, double interest){
        date= new Date();
        System.out.println("This is your account statement...!!");
        System.out.format("|%20s|%20s|%20s|%20s|%20s|\n","Date","Account Number","Account Balance","Previous transaction","Your interest");
        System.out.format("|%20s|%20d|%20s|%20s|%20s|\n",dateFormat.format(date),accountNumber,currency.format(accountBalance),transaction,currency.format(interest));


    }
}
