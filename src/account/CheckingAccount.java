package account;

import client.Client;
import exception.InsufficientBalanceException;

public class CheckingAccount extends Account {
    private final AccountType type;

    public CheckingAccount(Client client) {
        super(client);
        this.type = AccountType.CHECKING;
    }

    @Override
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited " + amount + " to the account.");
    }

    @Override
    public void withdraw(double amount) {
        if (this.balance < amount) {
            this.balance -= amount;
            System.out.println("Withdrawing " + amount + " from the account");
        }
    }

    @Override
    public void transfer(double amount, Account accountDestiny) {
        if (this.balance >= amount) {
            this.balance -= amount;
            accountDestiny.deposit(amount);
            System.out.println("Transfer R$" + amount + " to account number " + accountDestiny.getNumber());
        } else {
            throw new InsufficientBalanceException();
        }
    }

    @Override
    public String toString() {
        return "[Account: " + this.number + " Agency: " + this.agency + " Type: " + this.type.getType() + " Balance: " + this.balance + "]";
    }

    public AccountType getType() {
        return type;
    }
}
