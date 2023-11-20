package com.teachmeskills.lesson6.Task1.additionaltask.task1;

public class Bank {
    Client client;
    int con;

    public Bank(Client client,int con) {
        this.client = client;
        this.con = con;
    }

    public void sumContribution(int years) {
        client.sum -= con;
        for (int i = 0; i < years; i++) {
            int percent = con / 10;
            con += percent;
        }
        client.sum += con ;
    }
}
