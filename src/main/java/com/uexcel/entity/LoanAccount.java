package com.uexcel.entity;

import jakarta.persistence.*;

@Entity
@Table(name="loan_account")
public class LoanAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loan_account_id")
    private long loanAccountId;
    private Double amount;

    @ManyToOne
    @JoinColumn(
            name="customer_account_id" ,
            foreignKey = @ForeignKey(name="FK_customer_account")
    )
    private CustomerAccount customerAccount;

    public long getLoanAccountId() {
        return loanAccountId;
    }

    public void setLoanAccountId(long loanAccountId) {
        this.loanAccountId = loanAccountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CustomerAccount getCustomerAccount() {
        return customerAccount;
    }

    public void setCustomerAccount(CustomerAccount customerAccount) {
        this.customerAccount = customerAccount;
    }

    @Override
    public String toString() {
        return "LoadAccount{" +
                "loanAccountId=" + loanAccountId +
                ", amount=" + amount +
                ", customerAccount=" + customerAccount +
                '}';
    }
}
