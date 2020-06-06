package FinanceObjects.Planning;

import FinanceObjects.Accounts.Account;

import java.util.Date;

public class PlannedExpense extends PlannedPayment {
    public PlannedExpense(){}

    public PlannedExpense(Account from, float amount, String payee, Date dueDate, PaymentFrequencies frequency, String category, String memo){
        this.from = from;
        this.amount = amount;
        this.payee = payee;
        this.dueDate = dueDate;
        this.frequency = frequency;
        this.category = category;
        this.memo = memo;
    }
}
