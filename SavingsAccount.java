/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingaccountgui;

/**
 *
 * @author TJ liebsch
 */
//SavingsAccount has two functions, depositMonthlyInterest and withdrawal

public class SavingsAccount extends BankAccount{
        
    double annualInterestRate = 0.0047d;
    public void depositMonthlyInterest(){
        double balance = (getBalance()*annualInterestRate);
        deposit(balance);
    }
    /**
     * 
     * @param amount
     * @throws Insufficent Funds if amount is less than getBalance()
     */
    @Override
    public void withdrawl(double amount){
        if (getBalance() < amount)
        {
            System.out.println("Insufficent Funds: Card Declined");
        }
        else
        {
            System.out.println("Transaction Successful");
            double temp = getBalance() - amount;
            setBalance(temp);
        }
    }
}