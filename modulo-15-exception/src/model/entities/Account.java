package model.entities;

import model.exceptions.AccountException;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(){

    }

    public Account(int number,String holder,double balance,double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;

    }



    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double value){
        balance = balance + value;
    }

    public void withdraw(double value){
        if(balance<value){
            throw new AccountException("Insufficient funds");
        }
        if(withdrawLimit<value){
            throw new AccountException("The withdrawal amount exceeds the account's withdrawal limit.");
        }


        balance = balance - value;
    }




}
