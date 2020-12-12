package com.demo.day09_enums;

public enum Animal {
    // These are instances of enum with their values...
    CAT("Fido"), DOG("Fergus"), MOUSE("Jerry");

    private final String name;

    Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public String toString(){
        return "This animal is called: "+name;
    }
}
