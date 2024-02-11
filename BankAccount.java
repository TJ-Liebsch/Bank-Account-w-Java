/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingaccountgui;

/**
 *
 * @author TJ Liebsch
 */
//This is an abstract superclass for CheckingAccount.java and SavingsAccount.java
abstract class BankAccount implements BankAccountInterface{
    String owner;
    double balance;
    
    public BankAccount(){
        owner = "N/A";
        balance = 500.00d;
    }
    public String getOwner(){
        return owner;
    }
    public double getBalance(){
        return balance;
    }
    public void setOwner(String o){
        owner = o;
    }
    public void setBalance(double b){
        balance = b;
    }
    @Override
    public void deposit(double amount){
        double temp = getBalance() + amount;
        setBalance(temp);
    }
    @Override
    public void withdrawl(double amount){
        double temp = getBalance() - amount;
        setBalance(temp);
    }
}