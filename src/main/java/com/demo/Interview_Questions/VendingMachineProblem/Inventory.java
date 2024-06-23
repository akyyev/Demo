package com.demo.Interview_Questions.VendingMachineProblem;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    private Map<Item, Integer> inventory = new HashMap<>();

    // getQuantity, add, deduct, hasItem, clear, put

    public int getQuantity(Item item){
        return inventory.getOrDefault(item, 0);
    }

    public void add(Item item) {
        inventory.put(item, inventory.getOrDefault(item, 0)+1);
    }

    public void deduct(Item item) {
        if(hasItem(item)) {
            inventory.put(item, inventory.getOrDefault(item, 0)-1);
        }
    }

    public boolean hasItem(Item item) {
        return inventory.get(item)>0;
    }

    public void clear() {
        inventory.clear();
    }

    
}
