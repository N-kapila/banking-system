package V1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to console banking...!");
        System.out.println("**************************************");
        System.out.println("Enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Person person = new Person(name);
        person.generateAccountNumber();

        Account account= new Account(person.accountNumber, person.name);

       boolean action = true;
       while (action){
           System.out.println("**************************************");
           System.out.println("1.Check your balance\n" +
                   "2.Make a deposit\n" +
                   "3.Make a withdrawal\n" +
                   "4.Calculate Interest\n" +
                   "5.Print statement\n" +
                   "6.Check previous transaction.\n" +
                   "7.Exit the application\n");
           System.out.println("Select from the menu:");
           int actionNumber = scanner.nextInt();
           System.out.println("**************************************");
           switch (actionNumber){
               //check account balance
               case 1:
                   AccountBalanceChecker accountBalanceChecker = new AccountBalanceChecker(account.getAccountBalance());
                   accountBalanceChecker.chekAccountBalance();
                   break;
                   // make a deposit
               case 2:
                   System.out.println("Enter amount to deposit: ");
                   double depositAmount = scanner.nextDouble();
                   Depositor depositor =new Depositor(depositAmount);
                   account.setAccountBalance(depositor.depositMoney(account.getAccountBalance()));
                   System.out.println(account.getAccountBalance());
                   break;
                   //make withdraw
               case 3:
                   System.out.println("Enter amount to withdraw:");
                   double withdrawAmount = scanner.nextDouble();
                   WithdrawalFactory withdrawalFactory = new WithdrawalFactory(withdrawAmount);
                   account.setAccountBalance(withdrawalFactory.withdrawMoney(account.getAccountBalance()));
                   break;

               case 7:
                   action= false;
                   System.out.println("Thanks for banking with us...!");
                   break;

           }
       }

    }
}
