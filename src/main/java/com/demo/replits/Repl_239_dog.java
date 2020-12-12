package com.demo.replits;

/**
 * Write an abstract class Animal that contains 2 instance variables: name and age.
 * Provide getters and setters for these variables. Add an abstract method getAgeInHumanYears() that returns int.
 * Define 2 args constructor that initializes instance variables.
 *
 * Write a class Dog that extends the Animal class. Define 2 instance variables for this class: breed (String) and humanYears (int).
 *
 * Add a constructor that accepts three String parameters. The value of the first is used to initialize the value of name, the value of the second is used to initialize age and the value of the third is used to initialize breed.
 *
 * User super() to call parent constructor.
 *
 * Override toString() method, so it will display Dog info as in the example below:
 *
 * Name: name
 * Breed: breed
 * Age in calendar years: years
 * Age in human years: humanYears
 *
 * Use \n to print a text from a new line.
 *
 * Also, implement getAgeInHumanYears method, so It will convert dogs age into humans age as follows:
 *
 * if the dog's age is less or equals to 2, multiple age by 11;
 * otherwise, human years is equals to: 22 + ((age-2) * 5);
 *
 * Define an equals method for the Dog class that returns true if the dog’s name, age, and breed match the same variables for the other object that is being compared.
 */

public class Repl_239_dog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Alabay", 2, "Copan iti");
        Dog d2 = new Dog("Garaja", 3, "Awcy");
        Dog d3 = new Dog("Gaplan", 4, "tazy");
        Dog d4 = new Dog("Gaplan", 4, "tazy");

        System.out.println(d1);
        System.out.println("---------");
        System.out.println(d2);

        System.out.println("---------");
        System.out.println(d3.equals(d4));//before implementation of equals method will return false

    }
}

class Dog extends Animal{
    private String breed;
    private int humanYears;

    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        getAgeInHumanYears();
    }

    @Override
    public String toString() {
        return "Name: "+ super.getName()+"\nBreed: "+breed+"\nAge in calendar years: "+
                super.getAge()+"\nAge in human years: "+humanYears;
    }

    public int getAgeInHumanYears() {
        if (this.getAge() <= 2) humanYears = this.getAge() * 11;
        else humanYears = 22 + ((this.getAge() - 2) * 5);
        return humanYears;
    }

    public boolean equals(Dog d){
        return this.getName().equals(d.getName()) &&
                this.getAge()==d.getAge() &&
                this.breed.equals(d.breed);
    }

}

abstract class Animal{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

}
