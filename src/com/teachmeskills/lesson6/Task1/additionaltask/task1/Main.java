package com.teachmeskills.lesson6.Task1.additionaltask.task1;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("egor", 1500);
        Bank bank = new Bank(client,1000);
        bank.sumContribution(5);
        System.out.println(client);
    }
}
