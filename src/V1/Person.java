package V1;

public class Person {
    String name;
    long accountNumber;

    public Person(String name) {
        this.name = name;
        System.out.println("Hello "+name);
    }

    public long generateAccountNumber(){
        long randomNumber = Math.round(Math.random()*((1000000-100000)+1)+100000);
        this.accountNumber = randomNumber;
        System.out.println("Your account number is: "+accountNumber);
        return accountNumber;
    }
}
