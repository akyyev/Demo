package com.demo.Interview_Questions.VendingMachineProblem;

import java.util.List;

public interface VendingMachineInterface {

    // selectItem, insertCoin, refund, returnChange, reset

    void selectItem(Item item);
    int getPrice(Item item);
    List<Coin> refund();
    List<Coin> change();
    void reset();

}
