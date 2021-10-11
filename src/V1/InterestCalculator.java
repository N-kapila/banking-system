package V1;

import java.text.NumberFormat;

public class InterestCalculator {
    NumberFormat currency = NumberFormat. getCurrencyInstance();
    double interest;

    public void calculateInterest(double accountBalance){
        interest= accountBalance*0.12;
        System.out.println("Your annual interest is:"+ currency.format(interest));
    }

    public double getInterest() {
        return interest;
    }
    public void setInterest(double accountBalance){
        interest=accountBalance*0.12;
    }
}
