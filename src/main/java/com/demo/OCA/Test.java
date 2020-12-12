package com.demo.OCA;

public class Test {

}

class Employee extends Test{
    private String name;
    private int age, salary;

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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int age) {
        setName(name);
        setAge(age);
        setSalary(2000);
    }

    public Employee(String name, int age, int salary) {
        this(name, age); //this() and super() constructor calls need to be first statement on the constructor...
        setSalary(2000);
    }
}

class Vehicle{
    String type = "4w";
    int maxSpeed = 100;

    public Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeed = maxSpeed;
    }

}

class Car extends Vehicle{
    String trans;

    Car(String trans){
        super("5w", 200);
        //super();
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans){
        super(type, maxSpeed);
        //calling 2 constructors is not allowed
        //this(trans);
        this.trans = trans;
    }
}