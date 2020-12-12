package com.demo.replits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repl_238_wending_machine {

    public static void main(String[] args) {
        DrinkVendingMachine vending = new DrinkVendingMachine(
                new Drink("Iced Coffee",4.50,10),
                new Drink("Iced Tea",2.50,5),
                new Drink("Smart Water",4.0,20),
                new Drink("Coke",2.30,13) );

        //System.out.println( vending.drinks.get(0).toString() ); //Drink{name='Iced Coffee', cost=4.5, quantity=10}
        vending.select(2);
        vending.pay(3);
        vending.pay(5);
        vending.returnChange();


    }

}

class DrinkVendingMachine extends VendingMachine {

    /**
     * HAS-A relation
     * DrinkVendingMachine HAS-A list of Drink objects
     */
    public List<Drink> drinks;

    /**
     * current will refer to currently selected drink
     */
    public Drink current;
    /**
     * after selecting the drink, whatever amount customer owes for the drink
     */
    public double amountLeftToPay;
    /**
     * after paying for the drink whatever amount is change
     */
    public double change;
    /**
     * used to check if drink is currently selected or no
     */
    public boolean isSelected;

    /**
     * public constructor.
     * @param drinksParam VAR-ARGs.
     *                    Assign each Drink object into drinks list
     */
    public DrinkVendingMachine(Drink... drinksParam) {
        //TODO
        drinks = new ArrayList<>();
        for(Drink each: drinksParam){
            drinks.add(each);
        }
    }

    /**
     * Override select abstract method.
     * This method will be used to select a drink in the vending machine
     * @param drinkNumber to select in Vending machine
     *                    options are 0 to drinks.size-1
     * 1. if drinkNumber is < 0 or more than drinks.size-1
     *       then isSelected should be false
     * 2. if a drink's quantity at that position is <=0
     *       then isSelected should be false
     * 3. Set the drink object at that index to current variable
     * 4. Set the cost of the selected drink to amountLeftToPay variable
     * 5. Set isSelected to true
     *
     */

    //TODO: implement select method
    public void select(int drinkNumber){
        if(drinkNumber<0 || drinkNumber> drinks.size()-1) isSelected = false;
        if(drinks.size()<=0) isSelected = false;
        else {
            current = drinks.get(drinkNumber);
            System.out.println(current);
            isSelected = true;
            amountLeftToPay = current.getCost();
        }
    }





    /**
     *
     * Override abstract method pay
     * Method is used to pay for the selected drink
     *
     * 1. If isSelected is false then return 0.0
     * 2. Deduct money from amountLeftToPay
     * 3. if there is any change set the value to change variable (positive value)
     * 4. Decrease the quantity of the selected drink by 1
     * 5. Return amountLeftToPay value
     *
     * @param money
     *
     */
    //TODO: implement pay method
    public double pay(double money){
        if(!isSelected) return 0;
        System.out.println("Paying $"+ money);

        amountLeftToPay -= money;
        if(amountLeftToPay>0){
            System.out.println("You owe $"+amountLeftToPay);
        }
        if(amountLeftToPay<0) {
            change = -amountLeftToPay;
            current.setQuantity(current.getQuantity()-1);
        }
        return amountLeftToPay;
    }








    /**
     * Override abstract method returnChange
     * Method is used to return the change to the customer
     * Return the value of change from the method and
     * 1. Set change to 0
     * 2. Set amountLeftToPay to 0
     *
     * @return
     */

    //TODO: implement returnChange method
    public double returnChange(){
        this.amountLeftToPay = 0;
        System.out.println("Returning your $" + change + " change, you are good to go");
        return change=0;
    }




    /**
     * Override abstract method cancel
     * Method is used by customers to cancel any selected drinks
     * 1. set current drink to null
     * 2. amountLeftToPay is zero
     * 3. isSelected to false
     * 4. return any changes
     */

    //TODO: implement cancel method
    public void cancel(){
        current = null;
        amountLeftToPay = 0;
        isSelected = false;
    }


}


abstract class VendingMachine {

    public abstract void select(int itemNumber);
    public abstract double pay(double money);
    public abstract double returnChange();
    public abstract void cancel();

}

class Drink {
    private String name;
    private double cost;
    private int quantity;

    public Drink(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    /**
     *
     * @return String in this format:
     *Drink{name='Iced Coffee', cost=4.5, quantity=10}
     */
    @Override
    public String toString() {
        //TODO
        return "Drink{name='"+name+"', cost="+cost+", quantity="+quantity+"}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

/**
 * In this assignment we will build a simple Vending machine for drinks.
 *
 * There are many types of Vending Machines: for drinks, snacks, electronics, gold etc.
 *
 * So we decided to create parent abstract class  VendingMachines for all specific vending machines to extend.
 *
 * Abstract class VendingMachine contains abstract methods that any specific sub type of vending machines will extend and provide implementation.
 *
 * In this assignment we will implement DrinkVendingMachine that is based on Abstract class VendingMachine.
 *
 * DrinkVendingMachine is responsible to extend VendingMachine and provide functionality/implementation for each abstract method.
 *
 * Please go over method  and follow the instructions on top of each method.
 */
