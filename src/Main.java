import account.CheckingAccount;
import account.SavingsAccout;
import bank.Bank;
import client.Client;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Client gabezy = new Client("Gabezy", "0234231241");
        SavingsAccout savingsAccout = new SavingsAccout(gabezy);
        CheckingAccount checkingAccount = new CheckingAccount(gabezy);

        bank.addAccount(savingsAccout);
        bank.addAccount(checkingAccount);

        checkingAccount.deposit(1000);
        checkingAccount.transfer(500, savingsAccout);

        checkingAccount.accountStatement();
        savingsAccout.accountStatement();

        bank.getAccounts().forEach(System.out::println);



    }

}