package com.demo.day09_enums;

public class Tester {
    public static void main(String[] args) {

        Level lvl = Level.HIGH;

        if(lvl.getLevelNum()==3) {
            System.out.println("Changing to Low");
            lvl=Level.LOW;
        }

        System.out.println(lvl.getLevelNum());

    }
}

class Tester2{
    public static void main(String[] args) {
        Animal animal = Animal.CAT;

        System.out.println(Animal.CAT);             // uses toString method - Fido
        System.out.println(Animal.CAT.name());      // name of enum         - CAT
        System.out.println(Animal.valueOf("DOG"));  // Fergus
        System.out.println(Animal.MOUSE.getName()); // Jerry


        System.out.println(animal instanceof Animal); // true
        System.out.println(animal instanceof Enum); // true



    }
}
