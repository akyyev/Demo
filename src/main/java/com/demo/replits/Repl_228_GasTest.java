package com.demo.replits;

public class Repl_228_GasTest {


}

class GasTank{
    private double amount = 0; //10
    double capacity; //50
    //addGas(45)

    double fillUp(){
        double diff = capacity - amount;
        amount = capacity;
        return diff;
    }


    double getGasLevel(){
        return amount;
    }

    boolean isFull(){
        return amount>capacity-0.1;
    }


    boolean isEmpty(){
        return amount<0.1;
    }

    void useGas(double amount){
        this.amount -= amount;
        if(this.amount<0) this.amount = 0;
    }


    public GasTank(double capacity) {
        this.capacity = capacity;
    }

    void addGas(double gasAmount){
        amount += gasAmount;
        if (amount>capacity) amount = capacity;
    }




}
