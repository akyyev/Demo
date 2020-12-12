package com.demo.day11_wildcards;


import java.util.ArrayList;

public class WildCards {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Amy"));
        animals.add(new Animal("Amy2"));


        ArrayList<Sheep> sheeps = new ArrayList<>();
        sheeps.add(new Sheep("Sheepy1"));
        sheeps.add(new Sheep("Sheepy2"));
        sheeps.add(new Sheep("Sheepy3"));

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Caty1"));
        cats.add(new Cat("Caty2"));


        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book());
        books.add(new Book());

        // AnyType
        printList(books);
        printList2(animals);
        // printList2(books); Since Book class doesn't extend Animal class it will give compile error
        printList3(animals);

    }

    // No type is given
    private static void printList(ArrayList<?> list){
        for(Object each: list){
            System.out.println(each);
        }
    }

    // it can print any list that contains classes that inherits animal class
    private static void printList2(ArrayList<? extends Animal> list){
        for(Animal each: list){
            System.out.println(each);
            each.mysteryMethod();
        }
    }

    // it can take only super class of Cat or itself.
    private static void printList3(ArrayList<? super Cat> list){
        for(Object each: list){
            System.out.println(each);
        }
    }

}

class Animal{
    String name;

    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sound(){
        System.out.println("Mooo, meee, meow, eeee, ... ");
    }

    public void printType(){
        System.out.println("I am animal!");
    }

    public void mysteryMethod(){
        System.out.println("This is mystery method");
    }
}

class Sheep extends Animal{


    public Sheep(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                '}';
    }

    public void sound(){
        System.out.println("Meeee!");
    }

    public void printType(){
        System.out.println("I am sheep!");
    }

    public void jump() {
        System.out.println("Sheep jumps on mountains!!!");
    }
}

class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Book{

}