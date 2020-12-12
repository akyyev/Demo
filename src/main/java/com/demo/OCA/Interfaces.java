package com.demo.OCA;

public class Interfaces {
}

 interface Herbivore {
    public int eatPlants();
}
 interface Omnivore {
    public void eatPlants(int a);
    //public String eatPlants();
}
class Bear implements Herbivore, Omnivore {


    public int eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants: 10");
        return 10;
    }
    public void eatPlants(int a) { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }
}