package com.demo.replits;

import java.util.List;

public class Repl_227_parking_Meter {

    /**
     * Write a class named ParkingMeter containing:
     * Two instance variables named timeLeft and maxTime of type int.
     * The value of timeLeft should be initialized to 0.
     * A constructor accepting a single integer parameter
     * whose value is used to initialize the maxTime instance variable.
     *
     * A method named add that accepts an integer parameter.
     * If the value of the parameter is equal to 25,
     * the value of timeLeft is increased by 30;
     * otherwise no increase is performed.
     *
     * Furthermore, the increase occurs only if the value of timeLeft
     * will not exceed the value of maxTime.
     * add returns a boolean value: true if timeLeft was increase, false otherwise.
     *
     * A method named tick that accepts no parameters and returns no value.
     * tick decreases the value of timeLeft by 1, but only if the value of timeLeft is greater than 0.
     * A method named isExpired that accepts no parameters.
     * isExpired returns a boolean value: true if the value of timeLeft is equal to 0; false otherwise.
     */

    public static void main(String[] args) {
        ParkingMeter p1=new ParkingMeter(20);
        p1.add(10);
        System.out.println(p1.add(10));;
        p1.tick();
        System.out.println(p1.isExpired());
        System.out.println(p1.getTimeLeft());

    }


}

class ParkingMeter{
    private int timeLeft = 0; //instance variable
    private int maxTime;

    public void tick(){
        if(timeLeft>0) timeLeft--;
    }

    public boolean isExpired(){
        return timeLeft==0;
    }

    public boolean add(int time){
        if(time==25 && timeLeft + 30 <= maxTime) {
            timeLeft +=30;
            return true;
        }
        return false;
    }

    public int getTimeLeft(){
        return timeLeft;
    }

    //constructor
    public ParkingMeter(int maxTime){
        this.maxTime = maxTime;
    }

}