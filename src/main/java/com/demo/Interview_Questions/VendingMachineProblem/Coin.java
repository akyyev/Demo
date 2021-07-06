package com.demo.Interview_Questions.VendingMachineProblem;

public enum Coin {

    PENNY("Penny", 1), NICKEL("Nickel", 5), DIME("Dime", 10), QUARTER( "Quarter", 25);

    private int cents;
    private String name;

    Coin(String name, int cents){
        this.name = name;
        this.cents = cents;
    }

    public int getCents() {
        return cents;
    }

    public String getName() {
        return name;
    }

}
