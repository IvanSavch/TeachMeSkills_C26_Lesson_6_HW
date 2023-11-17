package com.teachmeskills.lesson6.Task1;

public class Client {
    public static void main(String[] args) {
        CreditCard oleg = new CreditCard(3306,1000);
        CreditCard maksim = new CreditCard(5006,1500);
        CreditCard egor = new CreditCard(2246,500);

        oleg.addMoney(3306,1000);
        oleg.informationOnCreditCard();

        maksim.addMoney(5006,500);
        maksim.informationOnCreditCard();

        egor.withdrawMoney(2246,250);
        egor.informationOnCreditCard();
    }
}
