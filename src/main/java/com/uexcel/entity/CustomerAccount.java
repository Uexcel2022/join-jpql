package com.uexcel.entity;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="customer_account")
public class CustomerAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="customer_account_id")
    private long customerAccountId;
    private String name;
    private Double amount;

    @OneToMany(mappedBy = "customerAccount", cascade = CascadeType.ALL)
    private List<LoanAccount> loadAccount;

    public long getCustomerAccountId() {
        return customerAccountId;
    }

    public void setCustomerAccountId(long customerAccountId) {
        this.customerAccountId = customerAccountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<LoanAccount> getLoadAccount() {
        return loadAccount;
    }

    public void setLoadAccount(List<LoanAccount> loadAccount) {
        this.loadAccount = loadAccount;
    }

    @Override
    public String toString() {
        return "CustomerAccount{" +
                "customerAccountId=" + customerAccountId +
                ", name='" + name + '\'' +
                ", amount=" + amount +
                '}';
    }
}
