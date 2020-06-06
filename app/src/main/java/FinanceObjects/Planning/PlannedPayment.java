package FinanceObjects.Planning;

import FinanceObjects.Accounts.Account;

import java.util.Date;

public abstract class PlannedPayment {
    protected Account from;
    protected float amount;
    protected String payee;
    protected Date dueDate;
    protected PaymentFrequencies frequency;
    protected String category;
    protected String memo;

    public PlannedPayment(){}

    public Account getFrom() {
        return from;
    }

    public void setFrom(Account from) {
        this.from = from;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public PaymentFrequencies getFrequency() {
        return frequency;
    }

    public void setFrequency(PaymentFrequencies frequency) {
        this.frequency = frequency;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
