package com.teachmeskills.lesson6.Task1;

/**
 * Create a CreditCard class with the fields account number and current amount in the account.
 * Create one constructor with two parameters.
 * Add a method that allows you to charge the amount to your credit card.
 * The method takes an amount as input and adds this amount to the current one.
 * Consider how you should set the method's input and output parameters.
 * Add a method that allows you to withdraw a certain amount from the card.
 * The method takes an amount as input and subtracts this amount from the current one.
 * Consider how you should set the method's input and output parameters.
 * Add a method that displays current card information.
 * Write a program that creates three objects of the CreditCard class that are given an account number and an initial amount.
 * Test script for verification: Place money on the first two cards and withdraw from the third. Display the current status of all three cards.
 */
public class CreditCard {
    int accountNumber;
    int sumOnCard;

    public CreditCard(int accountNumber, int sumOnCard) {
        this.accountNumber = accountNumber;
        this.sumOnCard = sumOnCard;
    }
    public void addMoney(int number, int money) {
        if (number == accountNumber) {
            sumOnCard = sumOnCard + money;
            System.out.println("add " + money + "BYN" + "on card " + number);
        } else {
            System.out.println("wrong input number");
        }
    }
    public void withdrawMoney(int number, int money) {
        if (number == accountNumber) {
            sumOnCard = sumOnCard - money;
            System.out.println("withdraw " + money + "BYN" + " on card " + number);
        }else {
            System.out.println("wrong input number account");
        }
    }
    public void informationOnCreditCard() {
        System.out.println("account number: " + accountNumber + "\n" +
                 "sum on card: " + sumOnCard);
    }
}
