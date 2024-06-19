package account;

import client.Client;

public abstract class Account {

    public static final int DEFAULT_AGENCY = 10001;
    protected static int NUMBER_SEQUENCE = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = DEFAULT_AGENCY;
        this.number = NUMBER_SEQUENCE++;
        this.balance = 0;
        this.client = client;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void transfer(double amount, Account accountDestiny);

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void accountStatement() {
        System.out.println("Account Statement");
        System.out.println("Agency: " + this.agency);
        System.out.println("Number: " + this.number);
        System.out.println("Balance: " + this.balance);
        System.out.println("Client: " + this.client);

    }


}
