package com.teachmeskills.lesson6.Task1.additionaltask.task1;

public class Client {
    String name;
    int sum;

    public Client(String name, int sum) {
        this.name = name;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                '}';
    }
}
