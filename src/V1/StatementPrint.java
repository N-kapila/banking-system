package V1;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StatementPrint {
    DateFormat dateFormat = new SimpleDateFormat("dd/mm/yy");
    NumberFormat currency = NumberFormat. getCurrencyInstance();
    Date date;

    public void printStatement(long accountNumber, double accountBalance){
        date= new Date();
        System.out.println("This is your account statement...!!");
        System.out.format("|%20s|%20s|%20s|\n","Date","Account Number","Account Balance");
        System.out.format("|%20s|%20d|%20s|\n",dateFormat.format(date),accountNumber,currency.format(accountBalance));


    }
}
