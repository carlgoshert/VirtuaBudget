package FinanceObjects.Budgets;

import FinanceObjects.Accounts.Account;
import java.util.ArrayList;

public class BudgetGroup {
    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<Budget> budgets;

    public BudgetGroup(){}

    public BudgetGroup(String name, ArrayList<Account> accounts, ArrayList<Budget> budgets){
        this.name = name;
        this.accounts = accounts;
        this.budgets = budgets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addAcount(Account account){
        this.accounts.add(account);
    }

    public ArrayList<Budget> getBudgets() {
        return budgets;
    }

    public void addBudget(Budget budget){
        this.budgets.add(budget);
    }
}
