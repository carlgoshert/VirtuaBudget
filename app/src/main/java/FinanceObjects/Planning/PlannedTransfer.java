package FinanceObjects.Planning;

import FinanceObjects.Accounts.Account;
import java.util.Date;

public class PlannedTransfer extends PlannedPayment {
    private Account to;

    public PlannedTransfer(){}

    public PlannedTransfer(Account from, Account to, float amount, Date dueDate, PaymentFrequencies frequency, String category, String memo){
        this.from = from;
        this.to = to;
        this.payee = to.toString();
        this.amount = amount;
        this.dueDate = dueDate;
        this.frequency = frequency;
        this.category = category;
        this.memo = memo;
    }

    public Account getTo() {
        return to;
    }

    public void setTo(Account to) {
        this.to = to;
    }
}
