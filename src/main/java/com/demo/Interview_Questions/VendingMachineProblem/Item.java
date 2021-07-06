package com.demo.Interview_Questions.VendingMachineProblem;

public enum  Item {

    COKE(25), PEPSI(35), SODA(45);

    private int amount;

    Item(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}

