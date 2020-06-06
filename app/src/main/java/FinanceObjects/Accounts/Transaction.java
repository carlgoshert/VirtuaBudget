package FinanceObjects.Accounts;

import java.util.Date;

public class Transaction {
    private float amount;
    private String payee;
    private Date date;
    private TransactionTypes type;
    private String category;
    private String memo;

    public Transaction(){}

    public Transaction(float amount, String payee, Date date, TransactionTypes type, String category, String memo){
        this.amount = amount;
        this.payee = payee;
        this.date = date;
        this.type = type;
        this.category = category;
        this.memo = memo;
    }

    public Transaction(Transaction copyFrom) {
        this.amount = copyFrom.getAmount();
        this.payee = copyFrom.getPayee();
        this.date = copyFrom.getDate();
        this.type = copyFrom.getType();
        this.category = copyFrom.getCategory();
        this.memo = copyFrom.getMemo();
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
        this.payee = payee == null ? "" : payee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) throws Exception {
        if (date == null)
            throw new Exception("Date given was null");
        this.date = date;
    }

    public TransactionTypes getType() {
        return type;
    }

    public void setType(TransactionTypes type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? "" : category;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? "" : memo;
    }
}
