package com.demo.OCA;

public class Chaining_Class {
    private int age;
    private String name;
    private double weight;
    private char gpa;

    public Chaining_Class(int age, String name, double weight, char gpa) {
        this.age = age;
        this.name = name;
        this.weight = weight;
        this.gpa = gpa;
    }

    public Chaining_Class() {
    }

    public int getAge() {
        return age;
    }

    public Chaining_Class setAge(int age) {
        this.age = age;
        return this;
    }

    public String getName() {
        return name;
    }

    public Chaining_Class setName(String name) {
        this.name = name;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Chaining_Class setWeight(double weight) {
        this.weight = weight;
        return this;
    }

    public char getGpa() {
        return gpa;
    }

    public Chaining_Class setGpa(char gpa) {
        this.gpa = gpa;
        return this;
    }

    @Override
    public String toString() {
        return "Chaining_Class{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gpa=" + gpa +
                '}';
    }

    public static void main(String[] args) {
        Chaining_Class c = new Chaining_Class()
                                                .setAge(15)
                                                .setGpa('A')
                                                .setName("Bob")
                                                .setWeight(55.5);

        System.out.println(c);
    }
}
