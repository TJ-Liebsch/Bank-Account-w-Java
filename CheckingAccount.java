/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingaccountgui;

/**
 *
 * @author TJ Liebsch
 */
//CheckingAccount has two functions, processCheck and withdrawal

public class CheckingAccount extends BankAccount{
    double insufficentFundsFee = 20.00d;
    
    /**
     * 
     * @param checkToProcess
     * @throws InsufficentFundsFee if checkToProcess is less than getBalance()
     */
    public void processCheck(double checkToProcess){
        if (getBalance() < checkToProcess)
        {
            System.out.println("Insufficent Funds: Card Declined");
            withdrawl(insufficentFundsFee);
        }
        else
        {
            System.out.println("Transaction Successful");
            withdrawl(checkToProcess);
        }
    }
    /**
     * 
     * @param amount
     * @throws InsufficentFundsFee if amount is less than getBalance()
     */
    @Override
    public void withdrawl(double amount){
        if (getBalance() < amount)
        {
            System.out.println("Insufficent Funds: Card Declined");
            double temp = getBalance() - insufficentFundsFee;
            setBalance(temp);
        }
        else
        {
            System.out.println("Transaction Successful");
            double temp = getBalance() - amount;
            setBalance(temp);
        }
    }
}
