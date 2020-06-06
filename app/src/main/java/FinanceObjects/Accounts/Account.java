package FinanceObjects.Accounts;

import java.util.ArrayList;

public class Account {
    private String name;
    private float balance;
    private AccountTypes accountType;
    private Currencies currency;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(){}

    public Account(String name, float balance, AccountTypes type, Currencies currency){
        this.name = name;
        this.balance = balance;
        this.accountType = type;
        this.currency = currency;
    }

    public Account(Account copyFrom){
        this.name = copyFrom.getName();
        this.balance = copyFrom.getBalance();
        this.accountType = copyFrom.getAccountType();
        this.currency = copyFrom.getCurrency();
        for(Transaction r : copyFrom.getTransactions()){
            this.transactions.add(new Transaction(r));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getBalance(){
        return balance;
    }

    public AccountTypes getAccountType(){
        return this.accountType;
    }

    public void setAccountType(AccountTypes accountType) {
        this.accountType = accountType;
    }

    public Currencies getCurrency() {
        return currency;
    }

    public void setCurrency(Currencies currency) {
        this.currency = currency;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction){
        this.transactions.add(transaction);
        this.balance += transaction.getAmount();
    }
}
